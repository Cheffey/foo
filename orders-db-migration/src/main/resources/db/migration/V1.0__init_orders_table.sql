CREATE TABLE IF NOT EXISTS `orders` (
  `id`               VARCHAR(50)                 NOT NULL UNIQUE,
  `address`          VARCHAR(50)                 NOT NULL,
  `total_cost`       DECIMAL(10,2)               NOT NULL,
  PRIMARY KEY (`id`)
);