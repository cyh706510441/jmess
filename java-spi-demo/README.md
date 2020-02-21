其他使用SPI机制的例子：    

mysql-connector-java-5.1.37.jar    
&ensp;&ensp;-- META-INF    
&ensp;&ensp;&ensp;&ensp;-- services    
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;-- java.sql.Driver
      
内容：    

com.mysql.jdbc.Driver    
com.mysql.fabric.jdbc.FabricMySQLDriver


## java spi的不足之处：   
1） java spi不能单独的获取某个指定的实现类    
如果能用类似red=spi.RedDemoService这种key\value形式，会好很多

2）java spi没有IOC、AOP机制    
依赖问题，不支持
