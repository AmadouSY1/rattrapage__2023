package com.example.rattrapage_design_pattern.repositories;

import com.example.rattrapage_design_pattern.entity.Classe;
import com.example.rattrapage_design_pattern.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findByClasse(Classe classe);
}
