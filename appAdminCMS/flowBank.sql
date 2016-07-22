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
	)ENGINE=InnoDB AUTO_INCREMENT=202 DEFAULT CHARSET=utf8;


