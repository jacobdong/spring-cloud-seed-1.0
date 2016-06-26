FROM registry.aliyuncs.com/com.lida/java8:latest

MAINTAINER JacobdDong@qq.com

ADD /@pom.artifactId@-@pom.version@.jar //app

EXPOSE  8761

#解决市区漂移问题
RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && ntpdate cn.pool.ntp.org

CMD ["java","-jar","//app/@pom.artifactId@-@pom.version@.jar"]
