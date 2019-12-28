package cn.jannal.spi;

import com.alibaba.dubbo.common.extension.SPI;

//
@SPI("real")
public interface BusinessInterface {
    void dosomething(String username);
}
