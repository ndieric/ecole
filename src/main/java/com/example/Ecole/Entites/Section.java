package com.example.Ecole.Entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;

@Entity
public class Section {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_section;
    private String designation;
    public Section() {
    }


    public Section(String designation) {
        this.designation = designation;
    }


    public int getId_section() {
        return id_section;
    }


    public void setId_section(int id_section) {
        this.id_section = id_section;
    }


    public String getDesignation() {
        return designation;
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }


    @Override
    public String toString() {
        return "Section [designation=" + designation + ", id_section=" + id_section + "]";
    }
    

    
    
}
