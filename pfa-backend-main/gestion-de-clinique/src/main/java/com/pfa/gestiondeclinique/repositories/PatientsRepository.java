package com.pfa.gestiondeclinique.repositories;

import com.pfa.gestiondeclinique.entities.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsRepository extends JpaRepository<Patients, Long> {
}