package com.example.myhopital.repository;

import com.example.myhopital.entities.Medecin;
import com.example.myhopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
