package com.example.myhopital.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dossier_medical {
    @Id
    @GeneratedValue
    private  Long matriculeDossier;
    private  String groupe_sanguine;
    private  Long fréquence_cardiaque;
    private  Float pression_artérielle;


}
