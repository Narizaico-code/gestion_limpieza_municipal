package org.rsosa.gestion_reportes.web.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.rsosa.gestion_reportes.dominio.dto.ContratacionDto;
import org.rsosa.gestion_reportes.dominio.dto.TipoReporteDto;
import org.rsosa.gestion_reportes.persistence.entity.Contratacion;
import org.rsosa.gestion_reportes.persistence.entity.TipoReporte;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContratacionMapper {
    @Mapping(source = "codigoContratacion", target = "hiring_id")
    @Mapping(source = "salario", target = "salary")
    @Mapping(source = "vacantes", target = "vacancy")
    ContratacionDto toDto(Contratacion entity);
    List<ContratacionDto> toDto(Iterable<Contratacion> entities);

@Mapping(source = "hiring_id", target = "codigoContratacion")
@Mapping(source = "salary", target = "salario")
@Mapping(source = "vacancy", target = "vacantes")
Contratacion toEntity(ContratacionDto contratacionDto);
void updateEntityFromDto(ContratacionDto contratacionDto, @MappingTarget Contratacion contratacion);
}


