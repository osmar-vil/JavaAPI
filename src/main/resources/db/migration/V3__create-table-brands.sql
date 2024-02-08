CREATE TABLE `brands` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(100) NOT NULL UNIQUE,
    `description` varchar(255) DEFAULT NULL,
    `image_url` varchar(255) DEFAULT NULL,
    `slug` varchar(100) NOT NULL UNIQUE,

    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    PRIMARY KEY (`id`)
)