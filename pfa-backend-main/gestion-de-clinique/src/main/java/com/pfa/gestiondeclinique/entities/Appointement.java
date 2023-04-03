package com.pfa.gestiondeclinique.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Appointement")
public class Appointement {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String  name;
      private String  prenom;
      private String  email;
      private Number telephone;
      private Date date;


}
