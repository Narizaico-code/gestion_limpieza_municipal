package org.rsosa.gestion_reportes.dominio.dto;

public record   PersonalDto (
    Long personal_id,
    String name,
    Integer number,
    String email
){
}
