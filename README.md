# ssm

## 安装jdk mysql tomcat maven 

## 建数据库和表  

```
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `title` varchar(100) NOT NULL COMMENT '书名',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `publishDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '出版日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;


INSERT INTO `books` VALUES ('1', 'Java编程思想', '98.50', '2005-01-02 00:00:00');
INSERT INTO `books` VALUES ('2', 'HeadFirst设计模式', '55.70', '2010-11-09 00:00:00');
INSERT INTO `books` VALUES ('3', '第一行Android代码', '69.90', '2015-06-23 00:00:00');
INSERT INTO `books` VALUES ('4', 'C++编程思想', '88.50', '2004-01-09 00:00:00');
INSERT INTO `books` VALUES ('5', 'HeadFirst Java', '55.70', '2013-12-17 00:00:00');
INSERT INTO `books` VALUES ('6', '疯狂Android', '19.50', '2014-07-31 00:00:00');
```

## 根据自己的用户密码，数据库名称配置数据源(jdbc.properties)

```
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8
jdbc.username=test
jdbc.password=1234
```

## 配置虚拟目录

 conf\Catalina\localhost 目录下新建一个名为 springmvc 的 XML 文件,内容为：
 
 ```
 <Context docBase="D:\work\git\github\ssm\springmvc\target\springmvc-0.0.1-SNAPSHOT"/>
 ```
注：docBase为项目编译的真实路径

## 编译启动服务
运行build.bat批处理

## 访问接口 
http://localhost:8080/springmvc/book/1/detail

查询id为1的书名
 
 
 ![avatar](/20190605095949.png)