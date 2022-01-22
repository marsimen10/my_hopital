package com.example.myhopital.controllers;

import com.example.myhopital.entities.Medecin;
import com.example.myhopital.services.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping(value = "/medecins")
public class MedecinController {
    @Autowired
    private MedecinService medecinService;

    @GetMapping("/show")
    public Iterable<Medecin> lisMedecins() {
        return medecinService.listMedecin();
    }

    @GetMapping(value = "/show/{id}")
    public Optional<Medecin> getMedecin(@PathVariable Long id) {
        return medecinService.getMedecin(id);
    }

    @PostMapping("/add")
    public Medecin addMedecin(@RequestBody Medecin medecin) {
        return medecinService.addMedecin(medecin);
    }


}
