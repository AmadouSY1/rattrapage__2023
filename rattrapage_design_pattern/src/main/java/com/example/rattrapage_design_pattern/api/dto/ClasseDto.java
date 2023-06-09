package com.example.rattrapage_design_pattern.api.dto;

import com.example.rattrapage_design_pattern.entity.Classe;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClasseDto {

    private Long id;
    private String libelle;

    public ClasseDto(Classe classe){
        id= classe.getId();
        libelle= classe.getLibelle();
    }
}
