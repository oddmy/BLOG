CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `organization_id` bigint(20) NOT NULL COMMENT '所属组织',
  `user_name` varchar(255) NOT NULL COMMENT '用户名称',
  `password` varchar(20) NOT NULL COMMENT '用户密码',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `email` varchar(50) NOT NULL COMMENT '邮箱',
  `token` varchar(255) NOT NULL COMMENT '令牌',
  `enabled` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0.禁用 1.启用',
  `loginTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次登录时间',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新时间',
  PRIMARY KEY (`id`),
  KEY `key_organization_id` (`organization_id`) USING BTREE,
  KEY `key_user_name` (`user_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `Group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新时间',
  `parent_id` bigint(20) NOT NULL COMMENT '所属用户组',
  `name` varchar(255) NOT NULL COMMENT '用户组名称',
  `description` varchar(255) NOT NULL COMMENT '用户组描述',
  `enabled` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0.禁用 1.启用',
  PRIMARY KEY (`id`),
  KEY `key_parent_id` (`parent_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户组表';