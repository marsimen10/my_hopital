package com.example.myhopital.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrateur {
    @Id
    @GeneratedValue
    private Long id ;
    private String nomAdmin;
    private String prenomAdmmin;
    private String emailAdmin;
    private String mot_de_passe;


}
