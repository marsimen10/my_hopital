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
public class Utilisateur {
    @Id
    @GeneratedValue
    private Long id ;
    private String prenom_utilisateur;
    private String date_naissance;
    private String email;
    private String mote_de_passe;
    private Long tel_utilisateur;
    private String photo;
    @ManyToOne
    private Administrateur administrateur;



}
