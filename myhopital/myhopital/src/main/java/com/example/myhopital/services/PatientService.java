package com.example.myhopital.services;

import com.example.myhopital.entities.Medecin;
import com.example.myhopital.entities.Patient;
import com.example.myhopital.repository.PatientRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@Data
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    public void deletePatientById(long id) {
        patientRepository.deleteById(id);
    }

    public Optional<Patient> getPatient(long id) {
        return patientRepository.findById(id);
    }

    public Iterable<Patient> listPatient() {
        return patientRepository.findAll();

    }
}
