1. mac下安装docker网络插件(https://github.com/AlmirKadric-Published/docker-tuntap-osx.git)
$ ./sbin/docker_tap_install.sh
$ ./sbin/docker_tap_up.sh 每次重启机器都要再次运行
//$ brew tap caskroom/cask
$ brew cask install tuntap

sudo -u $(ps aux |grep '[d]ocker.hyperkit' |cut -d' ' -f1) ./sbin/docker_tap_install.sh -f

1. 添加路由
//sudo route add 172.30.0.0/16 10.0.75.2
sudo route add -net 172.30.0.0/16 -netmask 255.255.255.0 10.0.75.2
2. 配置hosts
172.30.0.4 dubbo-zookeeper
172.30.0.5  dubboAdmin

3. 清理资源
docker network prune


dubbo://192.168.1.3:20880/com.alibaba.dubbo.demo.DemoService?anyhost=true&application=demo-provider&bean.name=com.alibaba.dubbo.demo.DemoService&dubbo=2.0.2&generic=false&interface=com.alibaba.dubbo.demo.DemoService&methods=sayHello&pid=59124&side=provider&timestamp=1577191564974


consumer://10.37.129.2/com.alibaba.dubbo.demo.DemoService?application=demo-consumer&category=consumers&check=false&dubbo=2.0.2&interface=com.alibaba.dubbo.demo.DemoService&methods=sayHello&pid=62143&qos.port=33333&side=consumer&timestamp=1577195067440
