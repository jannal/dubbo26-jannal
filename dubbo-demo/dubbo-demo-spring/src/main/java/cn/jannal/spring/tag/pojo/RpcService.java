package cn.jannal.spring.tag.pojo;

import java.util.StringJoiner;

public class RpcService {
    // 协议名称
    private String contact;

    // 服务名称
    private String serviceName;

    // 服务实现
    private String serviceImplName;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceImplName() {
        return serviceImplName;
    }

    public void setServiceImplName(String serviceImplName) {
        this.serviceImplName = serviceImplName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RpcService.class.getSimpleName() + "[", "]")
                .add("contact='" + contact + "'")
                .add("serviceName='" + serviceName + "'")
                .add("serviceImplName='" + serviceImplName + "'")
                .toString();
    }
}
