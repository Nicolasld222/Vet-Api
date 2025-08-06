package com.vet.veterinariaApi.controller;

import com.vet.veterinariaApi.model.Paciente;
import com.vet.veterinariaApi.service.PersonService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/paciente")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public Mono<Paciente> create(@RequestBody Paciente paciente) {
        return service.create(paciente);
    }

    @GetMapping
    public Flux<Paciente> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Mono<Paciente> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Mono<Paciente> update(@PathVariable Long id, @RequestBody Paciente person) {
        return service.update(id, person);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}

