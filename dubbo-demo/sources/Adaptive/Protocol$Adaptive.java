/*
 * Decompiled with CFR.
 *
 * Could not load the following classes:
 *  com.alibaba.dubbo.common.URL
 *  com.alibaba.dubbo.common.extension.ExtensionLoader
 *  com.alibaba.dubbo.rpc.Exporter
 *  com.alibaba.dubbo.rpc.Invoker
 *  com.alibaba.dubbo.rpc.RpcException
 */
package com.alibaba.dubbo.rpc;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Protocol;
import com.alibaba.dubbo.rpc.RpcException;

public class Protocol$Adaptive
        implements Protocol {
    @Override
    public void destroy() {
        throw new UnsupportedOperationException("method public abstract void com.alibaba.dubbo.rpc.Protocol.destroy() of interface com.alibaba.dubbo.rpc.Protocol is not adaptive method!");
    }

    @Override
    public int getDefaultPort() {
        throw new UnsupportedOperationException("method public abstract int com.alibaba.dubbo.rpc.Protocol.getDefaultPort() of interface com.alibaba.dubbo.rpc.Protocol is not adaptive method!");
    }

    public Invoker refer(Class clazz, URL uRL) throws RpcException {
        String string;
        if (uRL == null) {
            throw new IllegalArgumentException("url == null");
        }
        URL uRL2 = uRL;
        String string2 = string = uRL2.getProtocol() == null ? "dubbo" : uRL2.getProtocol();
        if (string == null) {
            throw new IllegalStateException(new StringBuffer().append("Fail to get extension(com.alibaba.dubbo.rpc.Protocol) name from url(").append(uRL2.toString()).append(") use keys([protocol])").toString());
        }
        Protocol protocol = (Protocol) ExtensionLoader.getExtensionLoader(Protocol.class).getExtension(string);
        return protocol.refer(clazz, uRL);
    }

    public Exporter export(Invoker invoker) throws RpcException {
        String string;
        if (invoker == null) {
            throw new IllegalArgumentException("com.alibaba.dubbo.rpc.Invoker argument == null");
        }
        if (invoker.getUrl() == null) {
            throw new IllegalArgumentException("com.alibaba.dubbo.rpc.Invoker argument getUrl() == null");
        }
        URL uRL = invoker.getUrl();
        String string2 = string = uRL.getProtocol() == null ? "dubbo" : uRL.getProtocol();
        if (string == null) {
            throw new IllegalStateException(new StringBuffer().append("Fail to get extension(com.alibaba.dubbo.rpc.Protocol) name from url(").append(uRL.toString()).append(") use keys([protocol])").toString());
        }
        Protocol protocol = (Protocol) ExtensionLoader.getExtensionLoader(Protocol.class).getExtension(string);
        return protocol.export(invoker);
    }
}