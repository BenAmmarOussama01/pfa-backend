package com.pfa.gestiondeclinique.controller;

import com.pfa.gestiondeclinique.entities.Appointement;
import com.pfa.gestiondeclinique.entities.Contact;
import com.pfa.gestiondeclinique.service.DataService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
@AllArgsConstructor
public class UtilisateurController {
    private final DataService dataService;
    @GetMapping("medecins")

    @PostMapping("/contact")
    public Contact contact(@RequestBody Contact contact){ return dataService.sendContact(contact);}

    @PostMapping("/appointement")
    public Appointement appointement(@RequestBody Appointement appointement){ return dataService.sendAppointement(appointement);}


}

