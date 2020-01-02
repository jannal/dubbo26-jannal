package cn.jannal.spring;


import cn.jannal.spring.tag.pojo.RpcService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext beans = new ClassPathXmlApplicationContext("classpath:applicationContext-all.xml");
        RpcService rpcService = beans.getBean(RpcService.class);
        //RpcService[contact='rmi', serviceName='test', serviceImplName='cn.jannal.test.A']
        System.out.println(rpcService);
    }
}
