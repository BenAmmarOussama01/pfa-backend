package com.pfa.gestiondeclinique.service;

import com.pfa.gestiondeclinique.entities.Appointement;
import com.pfa.gestiondeclinique.entities.Contact;
import com.pfa.gestiondeclinique.entities.Patients;

import java.util.List;
import java.util.Optional;

public interface DataService {
    List<Patients> getPatientsInfirmier();
    List<Patients> getPatientsMedecin();
    List<Patients> getPatientsAdmin();

    Optional<Patients> getOnePatient(Long id);
    Patients addPatient(Patients patient);
    Patients updatePatient(Long id, Patients newpatient);

    Contact sendContact(Contact contact);

    Patients sendRapport(Long id, Patients rapport);
   Appointement sendAppointement(Appointement rapport);

    String  deletePatient(Long id);


}
