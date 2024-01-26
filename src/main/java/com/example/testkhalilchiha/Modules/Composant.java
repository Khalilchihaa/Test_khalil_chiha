package com.example.testkhalilchiha.Modules;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "composant")
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="composant")
    private long id;

    @Column(name="nomComposant")
    private String nomComposant;
    @Column(name="prix")
    private float prix;



    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
}