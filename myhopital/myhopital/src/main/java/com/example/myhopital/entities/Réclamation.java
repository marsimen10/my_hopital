package com.example.myhopital.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Réclamation {
    @Id
    @GeneratedValue
    private Long id_rec;
    private String contenuRec;
    @ManyToOne
    private Administrateur administrateur;
    @ManyToOne
    private Patient patient;

}
