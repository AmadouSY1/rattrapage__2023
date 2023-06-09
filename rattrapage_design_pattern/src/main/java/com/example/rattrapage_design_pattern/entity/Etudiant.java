package com.example.rattrapage_design_pattern.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     @Column
    private  String nomComplet;
    @Column
    private  String matricule;

    @Column
    private String tuteur;
    @Column
    private String email;
    @Column
    private String password;




}
