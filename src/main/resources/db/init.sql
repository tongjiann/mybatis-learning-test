CREATE DATABASE ipersistent_test;

CREATE TABLE `user` (
  `id` int DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `ipersistent-test`.`user` (`id`, `username`) VALUES (1, 'Judy');
INSERT INTO `ipersistent-test`.`user` (`id`, `username`) VALUES (2, 'Huhu');