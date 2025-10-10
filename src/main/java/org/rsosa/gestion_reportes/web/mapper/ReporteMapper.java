package org.rsosa.gestion_reportes.web.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.rsosa.gestion_reportes.dominio.dto.ReporteDto;
import org.rsosa.gestion_reportes.persistence.entity.Reporte;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReporteMapper {
    @Mapping(source = "codigoReporte", target = "report_id")
    @Mapping(source = "descripcion", target = "description")
    @Mapping(source = "estado.nombre", target = "state.name")
    @Mapping(source = "vecino.nombre", target = "neighbor.name_neighbor")
    @Mapping(source = "personalAsignado.nombre", target = "staff.name")
    @Mapping(source = "tipoReporte.nombre", target = "report_type.name")
    ReporteDto toDto(Reporte entity);
    List<ReporteDto> toDto(Iterable<Reporte> entities);

    @InheritInverseConfiguration
    Reporte toEntity(ReporteDto reporteDto);
    void updateEntityToDto(ReporteDto reporteDto, @MappingTarget Reporte reporte);
}