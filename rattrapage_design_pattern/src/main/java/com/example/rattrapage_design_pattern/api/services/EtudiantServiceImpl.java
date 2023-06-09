package com.example.rattrapage_design_pattern.api.services;

import com.example.rattrapage_design_pattern.api.dto.EtudiantDto;
import com.example.rattrapage_design_pattern.entity.Etudiant;
import com.example.rattrapage_design_pattern.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EtudiantServiceImpl implements EtudiantService{

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public List<EtudiantDto> getAllEtudiant() {
        return etudiantRepository.findAll()
                .stream().map(etudiant -> new EtudiantDto(etudiant))
                .collect(Collectors.toList());
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
