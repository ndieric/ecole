package com.example.Ecole.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ecole.Entites.Eleve;
//import com.example.Ecole.Entites.Eleve_Cours;
import com.example.Ecole.Repository.CoursRepository;
import com.example.Ecole.Repository.EleveRepository;
import com.example.Ecole.Repository.sectionRepository;
import com.example.Ecole.coco.elevecoco;

@RestController
public class Controller {


    @Autowired
    EleveRepository eleveRepository;

    @Autowired
    CoursRepository coursRepository;

    @Autowired
    sectionRepository sect;


    @PostMapping("/insert")
    public Eleve inserer(@RequestBody elevecoco el){
        return eleveRepository.save(el.getEleve());

         
    }
    @GetMapping("/tous")
        public List<Eleve> tous(){
            return eleveRepository.findAll();
            
        }

    

    
}
