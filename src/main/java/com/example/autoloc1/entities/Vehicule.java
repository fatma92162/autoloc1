package com.example.autoloc1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "vehicule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    @Column(nullable = false, unique = true, length = 20)
    private String immatriculation;

    @Column(nullable = false, length = 50)
    private String marque;

    @Column(nullable = false, length = 50)
    private String modele;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal tarifJournalier;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_agence")
    private Agence agence;
    // Vehicule
    @OneToMany(mappedBy = "vehicule")
    private List<Maintenance> maintenances;
    // Vehicule
    @OneToMany(mappedBy = "vehicule")
    private List<Equipement> equipements;
    // Vehicule
    @OneToMany(mappedBy = "vehicule")
    private List<Reservation> reservations;
}



































