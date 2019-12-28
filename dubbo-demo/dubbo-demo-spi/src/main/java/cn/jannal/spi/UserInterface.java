package cn.jannal.spi;


import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("userImpl")
public interface UserInterface {
    //指定默认实现
    //@Adaptive({"userImpl"})
    @Adaptive
    public void run(URL url);
}
