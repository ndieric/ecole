package com.example.Ecole.coco;

import com.example.Ecole.Entites.Eleve;

public class elevecoco {
    private Eleve eleve;

    public elevecoco() {
    }

    public elevecoco(Eleve eleve) {
        this.eleve = eleve;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    @Override
    public String toString() {
        return "elevecoco [eleve=" + eleve + "]";
    }
    
    
    
}
