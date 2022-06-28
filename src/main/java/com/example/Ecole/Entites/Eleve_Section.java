package com.example.Ecole.Entites;

public class Eleve_Section {
    private Eleve eleve;
    private Section section;


    public Eleve_Section() {
    }


    public Eleve_Section(Eleve eleve, Section section) {
        this.eleve = eleve;
        this.section = section;
    }


    public Eleve getEleve() {
        return eleve;
    }


    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }


    public Section getSection() {
        return section;
    }


    public void setSection(Section section) {
        this.section = section;
    }


    @Override
    public String toString() {
        return "Eleve_Section [eleve=" + eleve + ", section=" + section + "]";
    }
    
    
    


    
}
