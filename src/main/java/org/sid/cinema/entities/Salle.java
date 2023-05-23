package org.sid.cinema.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor

public class Salle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 70)
    private String name;
    private int nombrePlace;
    @ManyToOne
    private Cinema cinema;
    @OneToMany(mappedBy = "salle")
    private Collection<Place> places;
    @OneToMany(mappedBy = "salle")
    private Collection<Projection> projections;
}
