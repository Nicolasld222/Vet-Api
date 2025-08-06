package com.vet.veterinariaApi.repository;


import com.vet.veterinariaApi.model.Paciente;
import com.vet.veterinariaApi.model.Paciente;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends ReactiveCrudRepository<Paciente, Long> {
}