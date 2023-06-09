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
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String libelle;

}
