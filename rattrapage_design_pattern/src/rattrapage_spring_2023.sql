-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 09 juin 2023 à 13:20
-- Version du serveur : 10.4.24-MariaDB
-- Version de PHP : 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `rattrapage_spring_2023`
--

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

CREATE TABLE `classe` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `classe_seq`
--

CREATE TABLE `classe_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `classe_seq`
--

INSERT INTO `classe_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom_complet` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `tuteur` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant_seq`
--

CREATE TABLE `etudiant_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `etudiant_seq`
--

INSERT INTO `etudiant_seq` (`next_val`) VALUES
(1);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
