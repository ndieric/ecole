package com.example.Ecole.Entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Eleve {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_eleve;
    private String nom_eleve;
    private int age;
    private String genre;

    


    @OneToMany (targetEntity = Cours.class, cascade = CascadeType.ALL)
    @JoinColumn (name = "ec_fk",referencedColumnName = "id_eleve")
    private List<Cours> cours;


    public List<Cours> getCours() {
        return cours;
    }

    // @OneToMany (targetEntity = Section.class, cascade = CascadeType.ALL)
    // @JoinColumn (name = "es_fk",referencedColumnName = "id_eleve")
    // private Section section;



    // public Section getSection() {
    //     return section;
    // }


    public Eleve() {
    }


    public Eleve(String nom_eleve, int age, String genre) {
        this.nom_eleve = nom_eleve;
        this.age = age;
        this.genre = genre;
    }


    public int getId_eleve() {
        return id_eleve;
    }


    public void setId_eleve(int id_eleve) {
        this.id_eleve = id_eleve;
    }


    public String getNom_eleve() {
        return nom_eleve;
    }


    public void setNom_eleve(String nom_eleve) {
        this.nom_eleve = nom_eleve;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getGenre() {
        return genre;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Eleve [age=" + age + ", genre=" + genre + ", id_eleve=" + id_eleve + ", nom_eleve=" + nom_eleve + "]";
    }
    
    
    

    
}
