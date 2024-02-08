CREATE TABLE `products` (
    `id` bigint unsigned NOT NULL AUTO_INCREMENT,
    `code` varchar(50) DEFAULT NULL UNIQUE,
    `reference` varchar(50) DEFAULT NULL UNIQUE,
    `name` varchar(150) NOT NULL UNIQUE,
    `slug` varchar(150) NOT NULL UNIQUE,
    `description` longtext DEFAULT NULL,

    `brand_id` bigint unsigned DEFAULT NULL,
    `category_id` bigint unsigned DEFAULT NULL,

    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    PRIMARY KEY (`id`),
    KEY `products_brands_id_foreign` (`brand_id`),
    KEY `products_categories_id_foreign` (`category_id`),
    CONSTRAINT `products_categories_id_foreign` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`),
    CONSTRAINT `products_brands_id_foreign` FOREIGN KEY (`brand_id`) REFERENCES `brands` (`id`)
)