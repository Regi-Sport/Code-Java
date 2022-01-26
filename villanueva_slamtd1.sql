-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 26 jan. 2022 à 14:31
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `villanueva_slamtd1`
--

-- --------------------------------------------------------

--
-- Structure de la table `candidat`
--

DROP TABLE IF EXISTS `candidat`;
CREATE TABLE IF NOT EXISTS `candidat` (
  `ID_CANDIDAT` int(11) NOT NULL,
  `NOM` char(10) DEFAULT NULL,
  `PRENOM` char(10) DEFAULT NULL,
  `AGE` int(11) DEFAULT NULL,
  `VILLE_ORIGINE` char(20) DEFAULT NULL,
  PRIMARY KEY (`ID_CANDIDAT`),
  UNIQUE KEY `CANDIDAT_PK` (`ID_CANDIDAT`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `candidat`
--

INSERT INTO `candidat` (`ID_CANDIDAT`, `NOM`, `PRENOM`, `AGE`, `VILLE_ORIGINE`) VALUES
(1, 'touille', 'rata', NULL, NULL),
(2, 'L\'éponge', 'Bob', NULL, NULL),
(3, 'Man', 'Spider', NULL, NULL);

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `candidats_notes`
-- (Voir ci-dessous la vue réelle)
--
DROP VIEW IF EXISTS `candidats_notes`;
CREATE TABLE IF NOT EXISTS `candidats_notes` (
`Prenom` char(10)
,`Nom` char(10)
,`AVG(NOTE)` decimal(14,4)
);

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `can_not`
-- (Voir ci-dessous la vue réelle)
--
DROP VIEW IF EXISTS `can_not`;
CREATE TABLE IF NOT EXISTS `can_not` (
`Prenom` char(10)
,`Nom` char(10)
,`AVG(NOTE)` decimal(14,4)
);

-- --------------------------------------------------------

--
-- Structure de la table `jury`
--

DROP TABLE IF EXISTS `jury`;
CREATE TABLE IF NOT EXISTS `jury` (
  `ID_JURY` int(11) NOT NULL,
  `NOM` char(10) DEFAULT NULL,
  `PRENOM` char(10) DEFAULT NULL,
  `AGE` int(11) DEFAULT NULL,
  `NOM_DOMAINE` char(20) DEFAULT NULL,
  `PRIX` char(20) DEFAULT NULL,
  PRIMARY KEY (`ID_JURY`),
  UNIQUE KEY `JURY_PK` (`ID_JURY`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `jury`
--

INSERT INTO `jury` (`ID_JURY`, `NOM`, `PRENOM`, `AGE`, `NOM_DOMAINE`, `PRIX`) VALUES
(1, 'Gravouil', 'Benjamin', NULL, NULL, NULL),
(2, 'Dindar', 'Djamil', NULL, NULL, NULL),
(3, 'Ducasse', 'Alain', NULL, NULL, NULL),
(4, 'Bo', 'Harry', NULL, NULL, NULL),
(5, 'Tout', 'Bouffe', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `notes`
--

DROP TABLE IF EXISTS `notes`;
CREATE TABLE IF NOT EXISTS `notes` (
  `ID_PLAT` int(11) NOT NULL,
  `ID_CANDIDAT` int(11) NOT NULL,
  `ID_JURY` int(11) NOT NULL,
  `NOTE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_PLAT`,`ID_CANDIDAT`,`ID_JURY`),
  UNIQUE KEY `NOTES_PK` (`ID_PLAT`,`ID_CANDIDAT`,`ID_JURY`),
  KEY `NOTES_FK` (`ID_PLAT`),
  KEY `NOTES2_FK` (`ID_CANDIDAT`),
  KEY `NOTES3_FK` (`ID_JURY`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `notes`
--

INSERT INTO `notes` (`ID_PLAT`, `ID_CANDIDAT`, `ID_JURY`, `NOTE`) VALUES
(1, 1, 1, 12),
(1, 1, 2, 15),
(1, 1, 3, 11),
(1, 1, 4, 13),
(1, 1, 5, 18),
(2, 1, 1, 11),
(2, 1, 2, 12),
(2, 1, 3, 4),
(2, 1, 4, 11),
(2, 1, 5, 17),
(3, 1, 1, 15),
(3, 1, 2, 15),
(3, 1, 3, 15),
(3, 1, 4, 13),
(3, 1, 5, 14),
(1, 2, 1, 18),
(1, 2, 2, 14),
(1, 2, 3, 12),
(1, 2, 4, 11),
(1, 2, 5, 18),
(2, 2, 1, 11),
(2, 2, 2, 13),
(2, 2, 3, 4),
(2, 2, 4, 11),
(2, 2, 5, 16),
(3, 2, 1, 12),
(3, 2, 2, 12),
(3, 2, 3, 8),
(3, 2, 4, 13),
(3, 2, 5, 20),
(1, 3, 1, 18),
(1, 3, 2, 12),
(1, 3, 3, 5),
(1, 4, 3, 7),
(1, 3, 5, 18),
(2, 3, 1, 9),
(2, 3, 2, 14),
(2, 3, 3, 4),
(2, 3, 4, 12),
(2, 3, 5, 16),
(3, 3, 1, 11),
(3, 3, 2, 12),
(3, 3, 3, 12),
(3, 3, 4, 14),
(3, 3, 5, 20);

-- --------------------------------------------------------

--
-- Structure de la table `plats`
--

DROP TABLE IF EXISTS `plats`;
CREATE TABLE IF NOT EXISTS `plats` (
  `ID_PLAT` int(11) NOT NULL,
  `description` char(20) DEFAULT NULL,
  PRIMARY KEY (`ID_PLAT`),
  UNIQUE KEY `PLATS_PK` (`ID_PLAT`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `plats`
--

INSERT INTO `plats` (`ID_PLAT`, `description`) VALUES
(1, 'Entrée'),
(2, 'Plat principal'),
(3, 'Dessert');

-- --------------------------------------------------------

--
-- Structure de la vue `candidats_notes`
--
DROP TABLE IF EXISTS `candidats_notes`;

DROP VIEW IF EXISTS `candidats_notes`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `candidats_notes`  AS  select `c`.`PRENOM` AS `Prenom`,`c`.`NOM` AS `Nom`,avg(`n`.`NOTE`) AS `AVG(NOTE)` from (`candidat` `c` join `notes` `n`) where (`n`.`ID_CANDIDAT` = `c`.`ID_CANDIDAT`) ;

-- --------------------------------------------------------

--
-- Structure de la vue `can_not`
--
DROP TABLE IF EXISTS `can_not`;

DROP VIEW IF EXISTS `can_not`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `can_not`  AS  select `candidat`.`PRENOM` AS `Prenom`,`candidat`.`NOM` AS `Nom`,avg(`notes`.`NOTE`) AS `AVG(NOTE)` from (`candidat` join `notes`) where (`candidat`.`ID_CANDIDAT` = `notes`.`ID_CANDIDAT`) ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
