-- auto Generated on 2018-05-22 11:07:15 
-- DROP TABLE IF EXISTS `user`; 
CREATE TABLE user(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    `address` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'address',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'user';
