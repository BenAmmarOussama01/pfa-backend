package com.pfa.gestiondeclinique.controller;

import com.pfa.gestiondeclinique.entities.Patients;
import com.pfa.gestiondeclinique.service.DataService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/admin")
@AllArgsConstructor
public class AdminController {
    private final DataService dataService;

    @PostMapping("/addpatient")
    public Patients add(@RequestBody Patients patient){
        return dataService.addPatient(patient);
    }

    @GetMapping("/patients")
    public List<Patients> getData(){
        return dataService.getPatientsAdmin();
    }

    @GetMapping("/patient/{id}")
    public Optional<Patients> getOnePatient(@PathVariable Long id){return dataService.getOnePatient(id);}


    @DeleteMapping("/patients/patient/{id}")
    public String delete(@PathVariable Long id){return dataService.deletePatient(id);}


    @PatchMapping("/patients/patient/{id}")
    public Patients updateNewPatient(@PathVariable Long id, @RequestBody Patients newpatient){return dataService.updatePatient(id ,newpatient);}
}
