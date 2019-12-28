package cn.jannal.spi.activate;

import com.alibaba.dubbo.common.extension.Activate;

@Activate(value = {"valueB"}, group = {"group1"})
public class BInterfaceImpl implements AInterface {
    @Override
    public void println(String info) {
        System.out.println("B:" + info);
    }
}
