package com.example.Ecole.Entites;

public class Eleve_Cours {
    private Eleve eleve;
    private Cours cours;


    public Eleve_Cours() {
    }


    public Eleve_Cours(Eleve eleve, Cours cours) {
        this.eleve = eleve;
        this.cours = cours;
    }


    public Eleve getEleve() {
        return eleve;
    }


    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }


    public Cours getCours() {
        return cours;
    }


    public void setCours(Cours cours) {
        this.cours = cours;
    }


    @Override
    public String toString() {
        return "Eleve_Cours [cours=" + cours + ", eleve=" + eleve + "]";
    }
    
    
    

    
}
