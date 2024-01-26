package com.example.testkhalilchiha.Modules;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMenu")
    private long idMenu;

    @Column(name="libelleMenu")
    private long libelleMenu;


    @Column(name="typeMenu")
    private TypeMenu typeMenu;


    @Column(name="prixTotal")
    private float prixTotal;


    @ManyToMany(mappedBy = "menus")
    private List<Client> clients;

    @OneToMany(mappedBy = "menu")
    private List<Composant> composants;
}