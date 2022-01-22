package com.example.myhopital.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consultation {
    @Id
    @GeneratedValue
    private Long idConsultation;
    private Long taille;
   private Float pression;
   private Float Température;
   private Float tension;
   private  String conclusion;
   private Float poids;
   private Date date_con ;
   private Date heure_con ;



}
