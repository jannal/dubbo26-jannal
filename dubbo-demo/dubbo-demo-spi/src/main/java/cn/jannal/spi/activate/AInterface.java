package cn.jannal.spi.activate;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("AImpl")
public interface AInterface {
    public void println(String info);
}
