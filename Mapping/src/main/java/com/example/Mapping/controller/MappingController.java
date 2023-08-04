package com.example.Mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mapping.model.Mapping;
import com.example.Mapping.repository.MappingRepository;

@RestController
@RequestMapping("/api")
public class MappingController {
    @Autowired
    MappingRepository mappingRepository;

    @GetMapping("/show_all/{id}")
    public Optional<Mapping> getAllValues(@PathVariable Long id) {
        return (Optional<Mapping>) mappingRepository.findById(id);
    }


     @DeleteMapping("/delete_all/{id}")
    public List<Mapping> deleteAllmapping(@PathVariable Long id) {
        mappingRepository.deleteById(id);
        return (List<Mapping>) mappingRepository.findAll();
    }




}
