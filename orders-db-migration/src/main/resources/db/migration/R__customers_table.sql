CREATE TABLE IF NOT EXISTS `customers` (
  `id`               VARCHAR(50)                 NOT NULL UNIQUE,
  `address`          VARCHAR(50)                 NOT NULL,
  `orders`             INT                       NOT NULL,
  PRIMARY KEY (`id`)
);
