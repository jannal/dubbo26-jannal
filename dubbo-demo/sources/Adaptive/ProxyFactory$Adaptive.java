/*
 * Decompiled with CFR.
 *
 * Could not load the following classes:
 *  com.alibaba.dubbo.common.URL
 *  com.alibaba.dubbo.common.extension.ExtensionLoader
 *  com.alibaba.dubbo.rpc.Invoker
 *  com.alibaba.dubbo.rpc.ProxyFactory
 *  com.alibaba.dubbo.rpc.RpcException
 */
package com.alibaba.dubbo.rpc;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.ProxyFactory;
import com.alibaba.dubbo.rpc.RpcException;

public class ProxyFactory$Adaptive
        implements ProxyFactory {
    public Object getProxy(Invoker invoker) throws RpcException {
        if (invoker == null) {
            throw new IllegalArgumentException("com.alibaba.dubbo.rpc.Invoker argument == null");
        }
        if (invoker.getUrl() == null) {
            throw new IllegalArgumentException("com.alibaba.dubbo.rpc.Invoker argument getUrl() == null");
        }
        URL uRL = invoker.getUrl();
        String string = uRL.getParameter("proxy", "javassist");
        if (string == null) {
            throw new IllegalStateException(new StringBuffer().append("Fail to get extension(com.alibaba.dubbo.rpc.ProxyFactory) name from url(").append(uRL.toString()).append(") use keys([proxy])").toString());
        }
        ProxyFactory proxyFactory = (ProxyFactory) ExtensionLoader.getExtensionLoader(ProxyFactory.class).getExtension(string);
        return proxyFactory.getProxy(invoker);
    }

    public Object getProxy(Invoker invoker, boolean bl) throws RpcException {
        if (invoker == null) {
            throw new IllegalArgumentException("com.alibaba.dubbo.rpc.Invoker argument == null");
        }
        if (invoker.getUrl() == null) {
            throw new IllegalArgumentException("com.alibaba.dubbo.rpc.Invoker argument getUrl() == null");
        }
        URL uRL = invoker.getUrl();
        String string = uRL.getParameter("proxy", "javassist");
        if (string == null) {
            throw new IllegalStateException(new StringBuffer().append("Fail to get extension(com.alibaba.dubbo.rpc.ProxyFactory) name from url(").append(uRL.toString()).append(") use keys([proxy])").toString());
        }
        ProxyFactory proxyFactory = (ProxyFactory) ExtensionLoader.getExtensionLoader(ProxyFactory.class).getExtension(string);
        return proxyFactory.getProxy(invoker, bl);
    }

    public Invoker getInvoker(Object object, Class clazz, URL uRL) throws RpcException {
        if (uRL == null) {
            throw new IllegalArgumentException("url == null");
        }
        URL uRL2 = uRL;
        String string = uRL2.getParameter("proxy", "javassist");
        if (string == null) {
            throw new IllegalStateException(new StringBuffer().append("Fail to get extension(com.alibaba.dubbo.rpc.ProxyFactory) name from url(").append(uRL2.toString()).append(") use keys([proxy])").toString());
        }
        ProxyFactory proxyFactory = (ProxyFactory) ExtensionLoader.getExtensionLoader(ProxyFactory.class).getExtension(string);
        return proxyFactory.getInvoker(object, clazz, uRL);
    }
}