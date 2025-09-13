-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 13, 2025 at 03:43 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `student_id` varchar(20) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` enum('Male','Female','Other') DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `course` varchar(100) DEFAULT NULL,
  `enrollment_year` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`student_id`, `first_name`, `last_name`, `age`, `gender`, `email`, `phone`, `address`, `course`, `enrollment_year`) VALUES
('123', 'cham', 'wik.', 15, 'Male', 'afefae.gmail.com', '0151', 'asdfafa', 'maTH', 2015),
('S10001', 'Nimal', 'Perera', 21, 'Male', 'nimal.perera@example.com', '0771234561', 'Colombo', 'Computer Science', 2022),
('S10002', 'Kavindi', 'Silva', 22, 'Female', 'kavindi.silva@example.com', '0771234562', 'Kandy', 'Information Systems', 2023),
('S10003', 'Tharindu', 'Fernando', 23, 'Male', 'tharindu.fernando@example.com', '0771234563', 'Galle', 'Software Engineering', 2021),
('S10004', 'Isuri', 'Wijesinghe', 20, 'Female', 'isuri.wijesinghe@example.com', '0771234564', 'Kurunegala', 'Data Science', 2024),
('S10005', 'Chathura', 'Bandara', 24, 'Male', 'chathura.bandara@example.com', '0771234565', 'Matara', 'Cyber Security', 2022);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`student_id`),
  ADD UNIQUE KEY `email` (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
