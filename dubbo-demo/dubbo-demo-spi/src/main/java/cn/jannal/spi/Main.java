package cn.jannal.spi;


import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

public class Main {
    @Test
    public void testDefaultExtension() {
        ExtensionLoader<BusinessInterface> extensionLoader = ExtensionLoader.getExtensionLoader(BusinessInterface.class);
        BusinessInterface businessInterface = extensionLoader.getDefaultExtension();
        //正在为用户：jannal，进行真实的业务处理。。。
        businessInterface.dosomething("jannal");

        //传入true，获取默认实现
        BusinessInterface defaultBusinessInterface = extensionLoader.getExtension("true");
        defaultBusinessInterface.dosomething("tom");
    }

    @Test
    public void testByName() {
        ExtensionLoader<BusinessInterface> extensionLoader = ExtensionLoader.getExtensionLoader(BusinessInterface.class);
        //通过配置名称获取实现,如果定义了wrapper，则返回的是wrapper的实例
        final BusinessInterface real = extensionLoader.getExtension("real");
        //正在为用户：jack，进行真实的业务处理。。。
        real.dosomething("jack");
    }


    @Test
    public void testAdaptive() {
        ExtensionLoader<UserInterface> extensionLoader = ExtensionLoader.getExtensionLoader(UserInterface.class);
        final UserInterface userImpl = extensionLoader.getAdaptiveExtension();
        //cn.jannal.spi.UserInterface$Adaptive@6d78f375
        System.out.println(userImpl);
        final UserInterface userImpl2 = extensionLoader.getAdaptiveExtension();
        //true,每次获取的都是同一个实例
        System.out.println(userImpl == userImpl2);
    }


}
