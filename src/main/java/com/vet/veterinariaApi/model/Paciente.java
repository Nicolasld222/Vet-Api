package com.vet.veterinariaApi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("paciente")
public record Paciente(
        @Id Long id,
        String tipo,
        String dueño
) {}