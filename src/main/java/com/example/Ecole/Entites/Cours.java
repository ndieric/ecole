package com.example.Ecole.Entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cours {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_cours;
    private String nom_cours;
    private float note;

    public Cours() {
    }

    public Cours(String nom_cours) {
        this.nom_cours = nom_cours;
    }

    public int getId_cours() {
        return id_cours;
    }

    public void setId_cours(int id_cours) {
        this.id_cours = id_cours;
    }

    public String getNom_cours() {
        return nom_cours;
    }

    public void setNom_cours(String nom_cours) {
        this.nom_cours = nom_cours;
    }
    

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Cours [id_cours=" + id_cours + ", nom_cours=" + nom_cours + ", note" + note + "]";
    }
    
    
    

    
}
