package cn.jannal.spi.impl;

import cn.jannal.spi.BusinessInterface;


public class BusinessImplWrapper implements BusinessInterface {
    private cn.jannal.spi.BusinessInterface businessInterface;

    public BusinessImplWrapper(BusinessInterface businessInterface) {
        this.businessInterface = businessInterface;
    }

    @Override
    public void dosomething(String username) {
        System.out.println("before");
        businessInterface.dosomething(username);
        System.out.println("after");
    }
}
