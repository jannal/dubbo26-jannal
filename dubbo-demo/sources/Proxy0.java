/*
 * Decompiled with CFR.
 *
 * Could not load the following classes:
 *  com.alibaba.dubbo.common.bytecode.ClassGenerator$DC
 *  com.alibaba.dubbo.demo.DemoService
 *  com.alibaba.dubbo.rpc.service.EchoService
 */
package com.alibaba.dubbo.common.bytecode;

import com.alibaba.dubbo.common.bytecode.ClassGenerator;
import com.alibaba.dubbo.demo.DemoService;
import com.alibaba.dubbo.rpc.service.EchoService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class proxy0
        implements ClassGenerator.DC,
        EchoService,
        DemoService {
    public static Method[] methods;
    private InvocationHandler handler;

    public String sayHello(String string) {
        Object[] objectArray = new Object[]{string};
        Object object = this.handler.invoke(this, methods[0], objectArray);
        return (String) object;
    }

    public Object $echo(Object object) {
        Object[] objectArray = new Object[]{object};
        Object object2 = this.handler.invoke(this, methods[1], objectArray);
        return object2;
    }

    public proxy0() {
    }

    public proxy0(InvocationHandler invocationHandler) {
        this.handler = invocationHandler;
    }
}
