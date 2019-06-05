# ssm

## 安装jdk mysql tomcat maven 

##导入数据  mysql.txt

##配置虚拟目录

 conf\Catalina\localhost 目录下新建一个名为 springmvc 的 XML 文件,内容为：
 
 ```
 <Context docBase="D:\work\git\github\ssm\springmvc\target\springmvc-0.0.1-SNAPSHOT"/>
 ```
注：docBase为项目编译的真实路径

##编译启动服务
运行build.bat批处理

##访问接口 
http://localhost:8080/springmvc/book/1/detail

查询id为以的书名
 
 
 ![avatar](/20190605095949.png)