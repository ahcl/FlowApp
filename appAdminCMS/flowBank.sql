CREATE DATABASE flowBank DEFAULT CHARACTER SET utf8;
USE flowBank;

DROP TABLE IF EXISTS `t_active`;
CREATE TABLE t_active(
		id int PRIMARY KEY auto_increment,
		activeName varchar(500) not null default '',
		activeContent text NOT NULL,
		activeUpDate timestamp NULL DEFAULT NULL,
		activeImg varchar(500) NOT NULL,
		activeFlag int(2) DEFAULT NULL,
		adminId int DEFAULT NULL
	)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
	
DROP TABLE IF EXISTS `t_news`;
CREATE TABLE t_news(
		id int PRIMARY KEY auto_increment,
		newsName varchar(500) not null default '',
		newsContent text NOT NULL,
		newsUpDate timestamp NULL DEFAULT NULL,
		newsImg varchar(500) NOT NULL,
		newsFlag int DEFAULT 0,
		adminId int DEFAULT NULL,
		newsCount int DEFAULT 0
	)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
