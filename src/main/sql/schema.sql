-- 创建数据库
create DATABASE seckill;
-- 使用数据库
use seckill;

-- 创建秒杀类型表
create table seckill_type(
`type_id` smallint NOT NULL AUTO_INCREMENT COMMENT  '商品分类码',
`describe` varchar(100) NOT NULL COMMENT '商品分类说明',
PRIMARY KEY (type_id)
)ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='秒杀类型表';

-- 创建秒杀库存表
create TABLE seckill(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
`name` varchar(120) NOT NULL COMMENT '商品名称',
`number` int NOT NULL COMMENT '库存数量',
`start_time` timestamp NOT NULL COMMENT '秒杀开启时间',
`end_time` timestamp NOT NULL COMMENT '秒杀结束时间',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`type_id` smallint NOT NULL DEFAULT 1 COMMENT '1：无分类 其他详情参考秒杀类型表',
PRIMARY KEY (seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time),
key idx_type(type_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

-- 1. 如果Key是空的, 那么该列值的可以重复，表示该列没有索引, 或者是一个非唯一的复合索引的非前导列
-- 2. 如果Key是PRI,  那么该列是主键的组成部分
-- 3. 如果Key是UNI,  那么该列是一个唯一值索引的第一列(前导列)，且不能含有空值(NULL)
-- 4. 如果Key是MUL,  那么该列的值可以重复, 该列是一个非唯一索引的前导列(第一列)或者是一个唯一性索引的组成部分但是可以含有空值NULL

-- 秒杀成功明细表
-- 用户登录认证相关的信息
create table success_killed(
`seckill_id` bigint NOT NULL COMMENT '秒杀商品id',
`user_phone` bigint NOT NULL COMMENT '用户手机号',
`state` tinyint NOT NULL DEFAULT -1 COMMENT '状态标示:-1:无效 0:成功 1:已付款 2:已发货',
`create_time` timestamp NOT NULL COMMENT '创建时间',
PRIMARY KEY(seckill_id,user_phone),/*联合主键*/
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';


-- 创建外键约束
-- 类型约束
ALTER TABLE `seckill` ADD CONSTRAINT `fk_type_id` FOREIGN KEY(`type_id`)  REFERENCES `seckill_type` ( `type_id` )
ON delete CASCADE ON update CASCADE;
-- 成功秒杀单对应秒杀商品
ALTER TABLE `success_killed` ADD CONSTRAINT `fk_seckill_id` FOREIGN KEY(`seckill_id`)   REFERENCES `seckill` ( `seckill_id` )
ON delete CASCADE ON update CASCADE;

-- 初始化类型数据
insert into
    seckill_type(`describe`)
values
    ('无分类'),
    ('手机');

-- 初始化秒杀商品数据
insert into
  seckill(name,number,start_time,end_time)
values
  ('1000元秒杀iphone6',100,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
  ('500元秒杀ipad2',200,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
  ('300元秒杀小米4',300,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
  ('200元秒杀红米note',400,'2015-11-01 00:00:00','2015-11-02 00:00:00');


-- 连接数据库控制台
mysql -uroot -p