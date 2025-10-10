package org.rsosa.gestion_reportes.web.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.rsosa.gestion_reportes.dominio.dto.MunicipalidadDto;
import org.rsosa.gestion_reportes.persistence.entity.Munipalidad;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MunicipalidadMapper {

    @Mapping(source = "codigoMunicipalidad", target = "municipality_id")
    @Mapping(source = "nombre", target = "name")
    @Mapping(source = "direccion", target = "address")
    @Mapping(source = "telefono", target = "number")
    @Mapping(source = "correo", target = "email")
    MunicipalidadDto toDto(Iterable<Munipalidad> entity);
    List<MunicipalidadDto> toDto(List<Munipalidad> entities);

    @Mapping(source = "municipality_id", target = "codigoMunicipalidad")
    @Mapping(source = "name", target = "nombre")
    @Mapping(source = "address", target = "direccion")
    @Mapping(source = "number", target = "telefono")
    @Mapping(source = "email", target = "correo")
    Munipalidad toEntity(MunicipalidadDto dto);
    void updateEntityFromDto(MunicipalidadDto dto, @MappingTarget Munipalidad entity);

}
