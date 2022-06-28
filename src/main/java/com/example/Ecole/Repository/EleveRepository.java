package com.example.Ecole.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ecole.Entites.Eleve;

public interface EleveRepository extends JpaRepository<Eleve,Integer> {
    
}
