package com.example.testkhalilchiha.Modules;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "restaurent")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRestaurent")
    private long idRestaurent;

    @Column(name="nom")
    private String nom;

    @Column(name="nbPlacesMax")
    private Long nbPlacesMax;

    @OneToMany
    @JoinColumn(name = "restaurant_id")
    private List<Menu> menus;


}