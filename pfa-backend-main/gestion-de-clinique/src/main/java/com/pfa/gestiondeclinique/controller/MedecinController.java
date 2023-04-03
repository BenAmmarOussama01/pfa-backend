package com.pfa.gestiondeclinique.controller;
import com.pfa.gestiondeclinique.entities.Patients;
import com.pfa.gestiondeclinique.service.DataService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/medecin")
@AllArgsConstructor
public class MedecinController {
    private final DataService dataService;
    @GetMapping("/patients")
    public List<Patients> getData(){
        return dataService.getPatientsMedecin();
    }

    @GetMapping("/patientdetails/{id}")
    public Optional<Patients> getOnePatient(@PathVariable Long id){return dataService.getOnePatient(id);}

    @PatchMapping("/rapportmedecin/{id}")
    public Patients send(@PathVariable Long id,@RequestBody Patients rapport){ return dataService.sendRapport(id ,rapport);}


}

