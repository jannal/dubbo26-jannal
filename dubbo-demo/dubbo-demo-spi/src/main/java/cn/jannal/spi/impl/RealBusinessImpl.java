package cn.jannal.spi.impl;

import cn.jannal.spi.BusinessInterface;
import cn.jannal.spi.UserInterface;


public class RealBusinessImpl implements BusinessInterface {
    private UserInterface userInterface;

    @Override
    public void dosomething(String username) {
        System.out.println("正在为用户：" + username + "，进行真实的业务处理。。。");
        //cn.jannal.spi.UserInterface$Adaptive@1810399e
        System.out.println(getUserInterface());
    }

    public UserInterface getUserInterface() {
        return userInterface;
    }

    public void setUserInterface(UserInterface userInterface) {
        this.userInterface = userInterface;
    }
}