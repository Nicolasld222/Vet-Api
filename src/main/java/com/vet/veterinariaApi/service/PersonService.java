package com.vet.veterinariaApi.service;

import com.vet.veterinariaApi.model.Paciente;
import com.vet.veterinariaApi.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonService {
   private final PacienteRepository repository;
    private final PacienteRepository pacienteRepository;

    public PersonService(PacienteRepository PacienteRepository, PacienteRepository pacienteRepository) {
        this.repository = pacienteRepository;
        this.pacienteRepository = pacienteRepository;
    }

    public Mono<Paciente> create(Paciente paciente) {
        return repository.save(paciente);
    }

    public Flux<Paciente> getAll() {
        return repository.findAll();
    }

    public Mono<Paciente> getById(Long id) {
        return repository.findById(id);
    }

    public Mono<Paciente> update(Long id, Paciente newData) {
        return repository.findById(id)
                .flatMap(existing -> repository.save(new Paciente(id, newData.tipo() , newData.dueno())));
    }

    public Mono<Void> delete(Long id) {
        return repository.deleteById(id);
    }
}
