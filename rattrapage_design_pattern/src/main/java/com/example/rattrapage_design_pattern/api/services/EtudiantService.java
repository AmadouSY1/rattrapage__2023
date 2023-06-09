package com.example.rattrapage_design_pattern.api.services;

import com.example.rattrapage_design_pattern.api.dto.EtudiantDto;
import com.example.rattrapage_design_pattern.entity.Etudiant;

import java.util.List;

public interface EtudiantService {
    List<EtudiantDto> getAllEtudiant();

    Etudiant addEtudiant(Etudiant etudiant);
}
