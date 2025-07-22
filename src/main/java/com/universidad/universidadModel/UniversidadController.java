package com.universidad.universidadModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("localhost:8080/api/universidades")
public class UniversidadController {

    @Autowired
    private UniversidadRepository universidadRepository;

    @GetMapping
    public List<Universidad> getAllUniversidades() {
        return universidadRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Universidad> getUniversidadById(@PathVariable Long id) {
        return universidadRepository.findById(id);
    }

    @PostMapping
    public Universidad createUniversidad(@RequestBody Universidad universidad) {
        return universidadRepository.save(universidad);
    }

    @PutMapping("/{id}")
    public Universidad updateUniversidad(@PathVariable Long id, @RequestBody Universidad universidadDetails) {
        Universidad universidad = universidadRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Universidad not found with id " + id));
        universidad.setName(universidadDetails.getName());
        universidad.setCountry(universidadDetails.getCountry());
        universidad.setCity(universidadDetails.getCity());
        return universidadRepository.save(universidad);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversidad(@PathVariable Long id) {
        Universidad universidad = universidadRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Universidad not found with id " + id));
        universidadRepository.delete(universidad);
    }

}
