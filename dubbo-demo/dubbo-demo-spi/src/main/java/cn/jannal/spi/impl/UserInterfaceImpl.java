package cn.jannal.spi.impl;

import cn.jannal.spi.UserInterface;
import com.alibaba.dubbo.common.URL;

public class UserInterfaceImpl implements UserInterface {
    @Override
    public void run(URL url) {
        System.out.println("userImpl run...");
    }
}
