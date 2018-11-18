```sql
CREATE TABLE books(
  id int not null auto_increment comment '编号' primary key,
  title varchar(100) not null comment '书名' unique,
  price decimal(10,2) default null comment '价格',
  publishDate timestamp null default CURRENT_TIMESTAMP comment '出版日期'
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
```
```sql
INSERT INTO `books` VALUES ('1', 'Java编程思想', '98.50', '2005-01-02 00:00:00');
INSERT INTO `books` VALUES ('2', 'HeadFirst设计模式', '55.70', '2010-11-09 00:00:00');
INSERT INTO `books` VALUES ('3', '第一行Android代码', '69.90', '2015-06-23 00:00:00');
INSERT INTO `books` VALUES ('4', 'C++编程思想', '88.50', '2004-01-09 00:00:00');
INSERT INTO `books` VALUES ('5', 'HeadFirst Java', '55.70', '2013-12-17 00:00:00');
INSERT INTO `books` VALUES ('6', '疯狂Android', '19.50', '2014-07-31 00:00:00');
```
> 参考链接：https://www.cnblogs.com/best/p/5648740.html