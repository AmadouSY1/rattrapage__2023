package com.example.rattrapage_design_pattern.controllers;

import com.example.rattrapage_design_pattern.entity.Classe;
import com.example.rattrapage_design_pattern.repositories.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ClasseController {
    @Autowired
    private ClasseRepository classeRepository;


}
