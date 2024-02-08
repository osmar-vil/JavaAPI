CREATE TABLE `categories` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(50) NOT NULL UNIQUE,
    `slug` varchar(50) NOT NULL UNIQUE,
    `description` varchar(255) DEFAULT NULL,

    `category_id` bigint unsigned DEFAULT NULL,

    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    PRIMARY KEY (`id`),
    KEY `categories_category_id_foreign` (`category_id`),
    CONSTRAINT `categories_category_id_foreign` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`)
)