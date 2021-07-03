package com.alibaba.dubbo.spi;


import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.cluster.Directory;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;
import com.alibaba.dubbo.rpc.cluster.support.AbstractClusterInvoker;

import java.util.List;

public class LogClusterInvoker<T> extends AbstractClusterInvoker<T> {
    private static final Logger logger = LoggerFactory.getLogger(LogClusterInvoker.class);

    public LogClusterInvoker(Directory<T> directory) {
        super(directory);
    }

    @Override
    protected Result doInvoke(Invocation invocation, List<Invoker<T>> invokers,
                              LoadBalance loadbalance) throws RpcException {

        checkInvokers(invokers, invocation);
        //使用负载均衡策略选择一个服务提供者
        Invoker<T> invoker = select(loadbalance, invocation, invokers, null);
        logger.info(String.format("methodName:%s,url:%s,attachments:%s",
                invocation.getMethodName(), invoker.getUrl(), invocation.getAttachments()));
        try {
            //执行远程调用

            Result result = invoker.invoke(invocation);
            logger.info(String.format("result:%s,attachments:%s", result.getValue(), result.getAttachments()));
            return result;
        } catch (Throwable e) {
            if (e instanceof RpcException && ((RpcException) e).isBiz()) {
                throw (RpcException) e;
            }
            throw new RpcException(e);
        }
    }
}
