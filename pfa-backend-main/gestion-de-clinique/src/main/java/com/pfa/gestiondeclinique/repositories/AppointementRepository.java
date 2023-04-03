package com.pfa.gestiondeclinique.repositories;

import com.pfa.gestiondeclinique.entities.Appointement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointementRepository extends JpaRepository<Appointement,Long> {
}
