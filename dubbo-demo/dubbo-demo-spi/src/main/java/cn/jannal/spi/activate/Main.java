package cn.jannal.spi.activate;


import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

import java.util.List;

public class Main {
    @Test
    public void testActivate() {
        ExtensionLoader<AInterface> extensionLoader = ExtensionLoader.getExtensionLoader(AInterface.class);
        URL url = URL.valueOf("test://localhost/test");
        url = url.addParameter(Constants.GROUP_KEY, "group1");
        url = url.addParameter("ext", "valueB");
        //url  url中的key  匹配的组名称
        //test://localhost/test?ext=valueB&group=group1
        List<AInterface> interfaces = extensionLoader.getActivateExtension(url, "ext", "group1");
        //[cn.jannal.spi.activate.BInterfaceImpl@1f89ab83]
        System.out.println(interfaces);
        //B:jannal
        for (AInterface aInterface : interfaces) {
            aInterface.println("jannal");
        }
    }
}
