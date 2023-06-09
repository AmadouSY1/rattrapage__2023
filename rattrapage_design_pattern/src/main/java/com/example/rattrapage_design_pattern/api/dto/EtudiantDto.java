package com.example.rattrapage_design_pattern.api.dto;

import com.example.rattrapage_design_pattern.entity.Etudiant;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EtudiantDto {
    private Long id;
    private String nomComplet;
    private String matricule;
    private String tuteur;

    private String email;
    private String password;

    public EtudiantDto (Etudiant etudiant){
        id= etudiant.getId();
        nomComplet= etudiant.getNomComplet();
        matricule= etudiant.getMatricule();
        tuteur= etudiant.getTuteur();
        email= etudiant.getEmail();
        password= etudiant.getPassword();
    }
}
