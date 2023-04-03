package com.pfa.gestiondeclinique.service;


import com.pfa.gestiondeclinique.entities.*;
import com.pfa.gestiondeclinique.repositories.AppointementRepository;
import com.pfa.gestiondeclinique.repositories.ContactRepository;
import com.pfa.gestiondeclinique.repositories.PatientsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DataServiceImpl implements DataService{
    @Autowired
    private final AppointementRepository appointementRepository;
    @Autowired
    private final ContactRepository contactRepository;
    @Autowired
    private final PatientsRepository patientsRepository;



    @Override

    public List<Patients> getPatientsInfirmier() {
        return patientsRepository.findAll();
    }



    @Override
    public List<Patients> getPatientsMedecin() {
        return patientsRepository.findAll();
    }

    @Override
    public List<Patients> getPatientsAdmin() {
        return patientsRepository.findAll();
    }

    @Override
    public Optional<Patients> getOnePatient(Long id) {
        return patientsRepository.findById(id);
    }

    @Override
    public Patients addPatient(Patients patient) {
        return patientsRepository.save(patient);
    }

    @Override
    public Patients updatePatient(Long id, Patients newpatient) {
        return patientsRepository.findById(id).map(
                p -> {
                    p.setFirstname(newpatient.getFirstname());
                    p.setLastname(newpatient.getLastname());
                    p.setAge(newpatient.getAge());
                    return patientsRepository.save(p);
                }).orElseThrow(()-> new RuntimeException("Patient non trouvé"));
    }



    @Override
    public Appointement sendAppointement(Appointement appointment) {
        return appointementRepository.save(appointment);
    }

    @Override
    public Contact sendContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Patients sendRapport(Long id, Patients rapport) {
        return patientsRepository.findById(id).map(
                p -> {
                    p.setBloodtension(rapport.getBloodtension());
                    p.setHeartbeats(rapport.getHeartbeats());
                    p.setWeight(rapport.getWeight());
                    p.setMedication(rapport.getMedication());
                    p.setDose(rapport.getDose());
                    p.setDuration(rapport.getDuration());
                    p.setObservation(rapport.getObservation());
                    return patientsRepository.save(p);
                }).orElseThrow(()-> new RuntimeException("Patient non trouvé"));
    }

    @Override
    public String deletePatient(Long id) {
        patientsRepository.deleteById(id);
        return "Patient supprimé";
    }


}
