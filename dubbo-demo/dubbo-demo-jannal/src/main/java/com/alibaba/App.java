package com.alibaba;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;

public class App {
    public static void main(String[] args) {
        ExtensionLoader<Protocol> loader = ExtensionLoader.getExtensionLoader(Protocol.class);
        final Protocol dubboProtocol = loader.getExtension("dubbo");
        final Protocol adaptiveExtension = loader.getAdaptiveExtension();
        //com.alibaba.dubbo.rpc.protocol.ProtocolListenerWrapper@6a2bcfcb
        System.out.println(dubboProtocol);
        //com.alibaba.dubbo.rpc.Protocol$Adaptive@4de8b406
        System.out.println(adaptiveExtension);
    }
}
