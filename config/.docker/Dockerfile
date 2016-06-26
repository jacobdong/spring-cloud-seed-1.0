FROM registry.aliyuncs.com/com.lida/java8:latest

MAINTAINER JacobdDong@qq.com

ADD /@pom.artifactId@-@pom.version@.jar //app

EXPOSE  8888

RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
#&& ntpdate cn.pool.ntp.org

CMD ["java","-jar","//app/@pom.artifactId@-@pom.version@.jar"]
