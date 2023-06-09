package com.example.rattrapage_design_pattern.repositories;

import com.example.rattrapage_design_pattern.entity.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClasseRepository  extends JpaRepository<Classe,Long>{

        List<Classe> findByLibelle(String libelle);

        List<Classe> findAll();

}
