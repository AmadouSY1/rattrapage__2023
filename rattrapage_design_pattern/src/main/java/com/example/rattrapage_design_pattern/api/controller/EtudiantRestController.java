package com.example.rattrapage_design_pattern.api.controller;

import com.example.rattrapage_design_pattern.api.dto.EtudiantDto;
import com.example.rattrapage_design_pattern.api.services.EtudiantService;
import com.example.rattrapage_design_pattern.entity.Etudiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantRestController {
    @Autowired
    private EtudiantService etudiantService;


    @GetMapping("")
    @ResponseBody
    public ResponseEntity<List<EtudiantDto>> getAllEtudiant(){
        List<EtudiantDto> body=etudiantService.getAllEtudiant();
        if (body.isEmpty())
            throw new RuntimeException("Pas d'étudiant disponible");
        return  new ResponseEntity<>(body, HttpStatus.OK);
    }

    @PostMapping("")
    @ResponseBody
    public ResponseEntity<Etudiant> addEtudiant(@RequestBody Etudiant etudiant){
        Etudiant createdEtudiant=etudiantService.addEtudiant(etudiant);
        return  new ResponseEntity<>(createdEtudiant, HttpStatus.CREATED);//201
    }
}
