package com.example.rattrapage_design_pattern.api.controller;


import com.example.rattrapage_design_pattern.api.dto.ClasseDto;
import com.example.rattrapage_design_pattern.api.services.ClasseService;
import com.example.rattrapage_design_pattern.entity.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
//@CrossOrigin("http://localhost:4200")
//Request http/:localhost:8080/api/classes
public class ClasseRestController {

    @Autowired
    private ClasseService classeService;

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<List<ClasseDto>> getAllClasses(){
        List<ClasseDto> body=classeService.getAllClasse();
        if (body.isEmpty())
            throw new RuntimeException("Pas de classe disponible");
        return  new ResponseEntity<>(body, HttpStatus.OK);//200
    }

    @PostMapping("")
    @ResponseBody
    public ResponseEntity<Classe> addClasse(@RequestBody Classe classe){
        Classe createdClasse=classeService.addClasse(classe);
        return  new ResponseEntity<>(createdClasse, HttpStatus.CREATED);//201
    }


}
