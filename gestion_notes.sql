-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 17 jan. 2023 à 14:44
-- Version du serveur : 8.0.27
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestion_notes`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `id_compte` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_compte` (`id_compte`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `mdp` varchar(255) NOT NULL,
  `id_compte` int NOT NULL AUTO_INCREMENT,
  `login` varchar(40) NOT NULL,
  PRIMARY KEY (`id_compte`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `compte`
--

INSERT INTO `compte` (`mdp`, `id_compte`, `login`) VALUES
('abdou', 25, 'abdou'),
('abdou', 26, 'abdou'),
('12a', 27, '12'),
('12a', 28, '12'),
('12a', 29, '12'),
('12a', 30, '12'),
('12a', 31, '12'),
('12a', 32, '12'),
('12a', 33, '12'),
('12a', 34, '12');

-- --------------------------------------------------------

--
-- Structure de la table `element`
--

DROP TABLE IF EXISTS `element`;
CREATE TABLE IF NOT EXISTS `element` (
  `id` int NOT NULL,
  `libelle` varchar(255) NOT NULL,
  `coeff` double NOT NULL,
  `id_mod` int NOT NULL,
  `id_prof` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_prof` (`id_prof`),
  KEY `id_mod` (`id_mod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `element`
--

INSERT INTO `element` (`id`, `libelle`, `coeff`, `id_mod`, `id_prof`) VALUES
(1, 'ORACLE', 2, 1, 30);

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `cne` varchar(40) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  PRIMARY KEY (`cne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `filiere`
--

DROP TABLE IF EXISTS `filiere`;
CREATE TABLE IF NOT EXISTS `filiere` (
  `code_fil` int NOT NULL AUTO_INCREMENT,
  `nom_fil` varchar(255) NOT NULL,
  `chef_fil` varchar(255) DEFAULT NULL,
  `coordinateur_fil` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`code_fil`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `filiere`
--

INSERT INTO `filiere` (`code_fil`, `nom_fil`, `chef_fil`, `coordinateur_fil`) VALUES
(1, 'nom', 'nom', 'nom');

-- --------------------------------------------------------

--
-- Structure de la table `modalite`
--

DROP TABLE IF EXISTS `modalite`;
CREATE TABLE IF NOT EXISTS `modalite` (
  `Id_moda` int NOT NULL AUTO_INCREMENT,
  `lebele` varchar(40) NOT NULL,
  `portentage` int NOT NULL,
  `Id` int NOT NULL,
  PRIMARY KEY (`Id_moda`),
  KEY `FK3yl5eg96wgs9ay5wxswpyrgg9` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `modalite`
--

INSERT INTO `modalite` (`Id_moda`, `lebele`, `portentage`, `Id`) VALUES
(1, 'cc', 30, 1),
(2, 'tp', 70, 1);

-- --------------------------------------------------------

--
-- Structure de la table `module`
--

DROP TABLE IF EXISTS `module`;
CREATE TABLE IF NOT EXISTS `module` (
  `code` int NOT NULL AUTO_INCREMENT,
  `nom_mod` varchar(255) NOT NULL,
  `id_fil` int NOT NULL,
  `code_sem` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`code`),
  KEY `id_fil` (`id_fil`),
  KEY `FKf3d1mg667j6um7q0xs1p0w5uj` (`code_sem`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `module`
--

INSERT INTO `module` (`code`, `nom_mod`, `id_fil`, `code_sem`) VALUES
(1, 'web', 1, '1'),
(2, 'k', 1, '1'),
(3, 'java', 1, '1'),
(4, 'f', 1, '1'),
(5, 'fff', 1, '1');

-- --------------------------------------------------------

--
-- Structure de la table `note`
--

DROP TABLE IF EXISTS `note`;
CREATE TABLE IF NOT EXISTS `note` (
  `Id` int NOT NULL,
  `cne` varchar(40) NOT NULL,
  `value` float NOT NULL,
  `nmr` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`nmr`),
  KEY `FKmp5oe6slgho02guwtiwvohurs` (`cne`),
  KEY `FKaoiianvfudn6pw8ta0g4hyd0j` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `professeur`
--

DROP TABLE IF EXISTS `professeur`;
CREATE TABLE IF NOT EXISTS `professeur` (
  `code` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `specialite` varchar(255) NOT NULL,
  `id_compte` int NOT NULL,
  PRIMARY KEY (`code`),
  KEY `id_compte` (`id_compte`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `professeur`
--

INSERT INTO `professeur` (`code`, `nom`, `prenom`, `specialite`, `id_compte`) VALUES
(30, 'salma', 'afik', 'abdou', 25),
(31, 'salma', 'afik', 'abdou', 33);

-- --------------------------------------------------------

--
-- Structure de la table `semestre`
--

DROP TABLE IF EXISTS `semestre`;
CREATE TABLE IF NOT EXISTS `semestre` (
  `code_sem` varchar(40) NOT NULL,
  `libelle_sem` varchar(255) NOT NULL,
  PRIMARY KEY (`code_sem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `semestre`
--

INSERT INTO `semestre` (`code_sem`, `libelle_sem`) VALUES
('1', '`1');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`id_compte`) REFERENCES `compte` (`id_compte`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `element`
--
ALTER TABLE `element`
  ADD CONSTRAINT `element_ibfk_1` FOREIGN KEY (`id_prof`) REFERENCES `professeur` (`code`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `element_ibfk_2` FOREIGN KEY (`id_mod`) REFERENCES `module` (`code`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `modalite`
--
ALTER TABLE `modalite`
  ADD CONSTRAINT `FK3yl5eg96wgs9ay5wxswpyrgg9` FOREIGN KEY (`Id`) REFERENCES `element` (`id`);

--
-- Contraintes pour la table `module`
--
ALTER TABLE `module`
  ADD CONSTRAINT `FKf3d1mg667j6um7q0xs1p0w5uj` FOREIGN KEY (`code_sem`) REFERENCES `semestre` (`code_sem`),
  ADD CONSTRAINT `module_ibfk_1` FOREIGN KEY (`id_fil`) REFERENCES `filiere` (`code_fil`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `note`
--
ALTER TABLE `note`
  ADD CONSTRAINT `FKaoiianvfudn6pw8ta0g4hyd0j` FOREIGN KEY (`Id`) REFERENCES `element` (`id`),
  ADD CONSTRAINT `FKmp5oe6slgho02guwtiwvohurs` FOREIGN KEY (`cne`) REFERENCES `etudiant` (`cne`);

--
-- Contraintes pour la table `professeur`
--
ALTER TABLE `professeur`
  ADD CONSTRAINT `professeur_ibfk_1` FOREIGN KEY (`id_compte`) REFERENCES `compte` (`id_compte`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
