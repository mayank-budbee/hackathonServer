CREATE TABLE `positions` (
                             `id` int NOT NULL,
                             `user_id` int DEFAULT NULL,
                             `date` varchar(25) DEFAULT NULL,
                             `lat` varchar(25) DEFAULT NULL,
                             `lon` varchar(25) DEFAULT NULL,
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
