# test-spring-boot-starter
自定义spring-boot-starter

## 使用方法
1. 下载代码，在代码目录下，使用mvn clean install命令将jar包打包并放到本地mavan仓库
2. 在spring-boot的项目中加入以下依赖：
``` xml
		<dependency>
			<groupId>com.kdyzm</groupId>
			<artifactId>test-spring-boot-starter</artifactId>
			<version>1.0-SNAPSHOT</version>
		</dependency>
```
3. 使用如下代码
``` java
    @Autowired
    private DemoBean demoBean;
   
   demoBean.hello();
```
即可测试调用，其中，需要在spring-boot的项目中添加一个配置项：
``` properties
kdyzm.url=https://www.baidu.com
```
，该值设置了啥，demoBean就会打印出啥，至此spring-boot-starter验证成功
