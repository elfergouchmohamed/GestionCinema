package org.sid.cinema.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 70)
    private String nomClient;
    private double prix;
    @Column(unique = true,nullable = true)
    private Integer codePayement;
    private boolean reservee;
    @ManyToOne
    private Place place;
    @ManyToOne
    private Projection projection;
}
