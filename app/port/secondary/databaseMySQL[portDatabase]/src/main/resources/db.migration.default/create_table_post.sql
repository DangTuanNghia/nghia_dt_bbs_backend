CCREATE TABLE `bbs`.`posts` (
                               `postId` INT AUTO_INCREMENT NOT NULL ,
                               `title` LONGTEXT NOT NULL ,
                               `content` LONGTEXT NOT NULL ,
                               `thumbnail` LONGTEXT NOT NULL ,
                               `create_by` INT NOT NULL ,
                               `created_at` DATETIME NOT NULL ,
                               `update_at` DATETIME NOT NULL ,
                               PRIMARY KEY (`id`)) AUTO_INCREMENT=1;
