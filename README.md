# spring-boot-dubbox-mybatis-rabitMQ-logback-sample

代码使用步骤：
1.  git  clone https://github.com/luowelcome/spring-boot-dubbox-mybatis-sample.git
2.  启动本机mysql（我的mysql是5.6），创建数据库：dubbox_test，同时执行./dubbox-facade/sql/sql.sql
3.  mvn clean package
4.  启动本机的zookeeper
5.  启动本机rabitMQ
6.  java -jar dubbox-facade/target/dubbox-facade-1.0-SNAPSHOT.jar  运行dubbox服务端
7.  java -jar dubbox-client/target/dubbox-client-1.0-SNAPSHOT.jar  运行dubbox客户端
8.  浏览器输入地址：http://localhost:8082/test  验证dubbox调用是否成功
9.  浏览器输入地址：http://localhost:8081/sendMsg  验证rabitMQ是否成功
10. postman输入地址：http://localhost:8081/test 
              Header ： Content-Type：application/json
              post参数： {"username":"Tom","password":"12345"}

