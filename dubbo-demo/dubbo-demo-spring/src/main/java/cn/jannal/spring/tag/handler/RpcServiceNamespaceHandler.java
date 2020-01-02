package cn.jannal.spring.tag.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 将组建注册到spring容器
 * @author jannal
 */
public class RpcServiceNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        //当遇到<rpc:rpc-service>的标签则使用RpcServicePublishBeanDefinitionParser解析器解析
        registerBeanDefinitionParser("rpc-service", new RpcServicePublishBeanDefinitionParser());
    }
}