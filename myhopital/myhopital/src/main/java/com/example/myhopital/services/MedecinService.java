package com.example.myhopital.services;

import com.example.myhopital.entities.Medecin;
import com.example.myhopital.repository.MedecinRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
public class MedecinService {
    @Autowired
    MedecinRepository medecinRepository;

    public Medecin addMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }
    public Medecin updateMedecin( Medecin medecin) {
        return medecinRepository.save(medecin);
    }
    public void deleteMedecin(Medecin medecin) {
        medecinRepository.delete(medecin);
    }
    public void deleteMedecinyById(long id) {
        medecinRepository.deleteById(id);
    }
    public Optional<Medecin> getMedecin(long id) {
        return medecinRepository.findById(id);
    }
    public Iterable<Medecin> listMedecin(){
        return medecinRepository.findAll();

    }
}
