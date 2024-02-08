CREATE TABLE users(
    `id` bigint unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(50) NOT NULL,
    `last_name` varchar(50) DEFAULT NULL,
    `email` varchar(100) NOT NULL UNIQUE,
    `password` varchar(255) NOT NULL,

    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    PRIMARY KEY (`id`)
);