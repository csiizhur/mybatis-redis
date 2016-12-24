#jedisPool连接redis超时：
	[root@iZuf6ayj54m6qqykp29r2bZ ~]# service iptables stop

#暴力删除redis缓存
	//删除当前数据库中的所有Key
	flushdb
	//删除所有数据库中的key
	flushall

#SpringBoot默认的缓存方式就是在内存中通过ConCurrentMap结构来进行数据的缓存

#阿里云maven镜像
	http://maven.aliyun.com/nexus/content/groups/public/
#setting.xml配置
	<mirrors>
		<mirror>
			<id>nexus-aliyun</id>
			<mirrorOf>*</mirrorOf>
			<name>Nexus aliyun</name>
			<url>http://maven.aliyun.com/nexus/content/groups/public</url>
			</mirror>
	</mirrors>