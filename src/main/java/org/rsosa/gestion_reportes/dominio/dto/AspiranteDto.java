package org.rsosa.gestion_reportes.dominio.dto;

public record AspiranteDto(
        Long aspirante_id,
        String name,
        String surname,
        Integer number,
        String email,
        Long hiring_id
) {
}
