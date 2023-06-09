package com.example.rattrapage_design_pattern.api.services;

import com.example.rattrapage_design_pattern.api.dto.ClasseDto;
import com.example.rattrapage_design_pattern.entity.Classe;
import java.util.List;

public interface ClasseService {
    List<ClasseDto> getAllClasse();

    Classe addClasse(Classe classe);
}
