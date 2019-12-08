1. mac下安装docker网络插件
$ ./sbin/docker_tap_install.sh
$ ./sbin/docker_tap_up.sh
$ brew tap caskroom/cask
$ brew cask install tuntap

1. 添加路由
sudo route add 172.30.0.0/16 10.0.75.2

2. 配置hosts
172.30.0.4 zookeeper


3. 清理资源
docker network prune