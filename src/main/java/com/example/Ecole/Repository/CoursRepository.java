package com.example.Ecole.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ecole.Entites.Cours;

public interface CoursRepository extends JpaRepository<Cours,Integer> {
    
}
