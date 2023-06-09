package com.example.rattrapage_design_pattern.api.services;

import com.example.rattrapage_design_pattern.api.dto.ClasseDto;
import com.example.rattrapage_design_pattern.entity.Classe;
import com.example.rattrapage_design_pattern.repositories.ClasseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClasseServiceImpl implements ClasseService{
    @Autowired
    private ClasseRepository classeRepository;

    @Override
    public List<ClasseDto> getAllClasse(){
        return classeRepository.findAll()
                .stream().map(classe -> new ClasseDto(classe))
                .collect(Collectors.toList());
    }

    @Override
    public Classe addClasse(Classe classe){
        return classeRepository.save(classe);
    }
}
