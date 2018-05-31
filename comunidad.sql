-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-05-2018 a las 15:35:23
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `comunidad`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incidencias`
--

CREATE TABLE `incidencias` (
  `id` int(11) NOT NULL,
  `idusuario` int(2) NOT NULL,
  `idincidencia` int(2) NOT NULL,
  `comentario` varchar(250) NOT NULL,
  `fecha_registro` date NOT NULL,
  `estado` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `incidencias`
--

INSERT INTO `incidencias` (`id`, `idusuario`, `idincidencia`, `comentario`, `fecha_registro`, `estado`) VALUES
(1, 1, 1, 'Comentario...', '0000-00-00', ''),
(5, 1, 3, 'Comentario de prueba', '0000-00-00', ''),
(7, 1, 3, 'hola', '0000-00-00', ''),
(8, 1, 4, 'Hola', '0000-00-00', ''),
(9, 1, 4, 'Hola', '0000-00-00', ''),
(10, 1, 4, 'Hola amigo', '0000-00-00', ''),
(11, 2, 5, 'Comentario desde Lorena', '0000-00-00', ''),
(13, 1, 2, 'hola', '2018-05-31', 'en curso'),
(14, 1, 2, 'hola', '0000-00-00', 'en curso'),
(15, 1, 2, 'hola', '2018-05-31', 'en curso'),
(16, 1, 4, 'Comentario...', '2018-05-31', 'en curso');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_incidencia`
--

CREATE TABLE `tipo_incidencia` (
  `id` int(2) NOT NULL,
  `tipo` varchar(15) NOT NULL,
  `subtipo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_incidencia`
--

INSERT INTO `tipo_incidencia` (`id`, `tipo`, `subtipo`) VALUES
(1, 'agua', 'inundacion'),
(2, 'agua', 'fallo agua caliente'),
(3, 'luz', 'bombilla'),
(4, 'luz', 'apagon'),
(5, 'ascensor', 'bloqueo'),
(6, 'agua', 'corte'),
(7, 'agua', 'sucia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(2) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `direccion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `password`, `correo`, `direccion`) VALUES
(1, 'sergio', '1234', 'sergio@gmail.com', 'Calle falsa 123'),
(2, 'lorena', '1234', '', ''),
(3, 'miguel', '1234', '', ''),
(8, 'victor', '1234', 'victor@gmail.com', 'Calle del Gintonic 3');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `incidencias`
--
ALTER TABLE `incidencias`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_usuario` (`idusuario`),
  ADD KEY `FK_incidencias` (`idincidencia`) USING BTREE;

--
-- Indices de la tabla `tipo_incidencia`
--
ALTER TABLE `tipo_incidencia`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `usuario` (`usuario`) USING BTREE;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `incidencias`
--
ALTER TABLE `incidencias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `tipo_incidencia`
--
ALTER TABLE `tipo_incidencia`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `incidencias`
--
ALTER TABLE `incidencias`
  ADD CONSTRAINT `FK_incidencias` FOREIGN KEY (`idincidencia`) REFERENCES `tipo_incidencia` (`id`),
  ADD CONSTRAINT `FK_usuario` FOREIGN KEY (`idusuario`) REFERENCES `usuarios` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
