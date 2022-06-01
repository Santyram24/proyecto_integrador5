-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-05-2022 a las 03:41:14
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `usuarios`
--
CREATE DATABASE IF NOT EXISTS `usuarios` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `usuarios`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--
-- Creación: 18-05-2022 a las 20:48:54
--

CREATE TABLE `empleados` (
  `usuario` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `tipo_empleado` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`usuario`, `contraseña`, `correo`, `tipo_empleado`) VALUES
('usuario1', 'u111', 'usuario1@gmail.com', 1),
('usuario2', 'u222', 'usuario2@gmail.com', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipaje`
--
-- Creación: 19-05-2022 a las 15:57:00
-- Última actualización: 20-05-2022 a las 01:27:27
--

CREATE TABLE `equipaje` (
  `idpasajero` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `vuelo` varchar(50) NOT NULL,
  `idequipaje` varchar(50) NOT NULL,
  `peso` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `equipaje`
--

INSERT INTO `equipaje` (`idpasajero`, `nombre`, `vuelo`, `idequipaje`, `peso`) VALUES
('111', 'lucho', 'a506', 'l123', '50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jefe`
--
-- Creación: 18-05-2022 a las 20:52:27
--

CREATE TABLE `jefe` (
  `usuario` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `jefe`
--

INSERT INTO `jefe` (`usuario`, `contraseña`) VALUES
('jefe1', 'j111');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`usuario`);

--
-- Indices de la tabla `equipaje`
--
ALTER TABLE `equipaje`
  ADD PRIMARY KEY (`idpasajero`);

--
-- Indices de la tabla `jefe`
--
ALTER TABLE `jefe`
  ADD PRIMARY KEY (`usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
