package com.example.testkhalilchiha.Modules;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCommandes")
    private long idCommandes;

    @Column(name="client_id")
    private long client_id;

    @Column(name="menu_id")
    private long menu_id;
}