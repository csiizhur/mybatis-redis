#jedisPool连接redis超时：
[root@iZuf6ayj54m6qqykp29r2bZ ~]# service iptables stop

#暴力删除redis缓存
//删除当前数据库中的所有Key
flushdb
//删除所有数据库中的key
flushall

#SpringBoot默认的缓存方式就是在内存中通过ConCurrentMap结构来进行数据的缓存