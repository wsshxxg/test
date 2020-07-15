/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.40 : Database - flight
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`flight` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `flight`;

/*Table structure for table `ro_user` */

DROP TABLE IF EXISTS `ro_user`;

CREATE TABLE `ro_user` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '用户名',
  `password` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '密码',
  `email` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '邮箱',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `ro_user` */

insert  into `ro_user`(`id`,`username`,`password`,`email`,`create_time`) values (1,'zhangsan','1234','10086@qq.com','2020-03-15 21:27:48'),(2,'lisi123','12345678','1726068830@qq.com','2020-03-30 09:39:17'),(9,'wangwu','12345678','10010@qq.com','2020-03-30 10:11:39');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
