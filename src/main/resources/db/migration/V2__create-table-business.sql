create table business(
    `id` bigint unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(100) NOT NULL UNIQUE,
    `description` varchar(255),
    `address` varchar(100) NOT NULL,
    `work_hours` varchar(30) NOT NULL,
    `phone` varchar(100) NOT NULL,
    `whatsapp` varchar(100) NOT NULL,
    `email` varchar(255) NOT NULL UNIQUE,

    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    PRIMARY KEY (`id`)
);