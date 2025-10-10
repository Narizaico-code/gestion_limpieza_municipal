package org.rsosa.gestion_reportes.web.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.rsosa.gestion_reportes.dominio.dto.AspiranteDto;
import org.rsosa.gestion_reportes.persistence.entity.Aspirante;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AspiranteMapper {
    @Mapping (target = "codigoAspirante", source = "aspirante_id" )
    @Mapping(target = "nombre", source = "name")
    @Mapping(target = "apellido", source = "surname")
    @Mapping(target = "numero", source = "number")
    @Mapping(target = "correo", source = "email")
    @Mapping(target = "contratacion", source = "hiring_id")

    AspiranteDto toDto (Aspirante entity);
    List<AspiranteDto> toDto (List<Aspirante> entity);

    @Mapping (target = "aspirante_id", source = "codigoAspirante" )
    @Mapping(target = "name", source = "nombre")
    @Mapping(target = "surname", source = "apellido")
    @Mapping(target = "number", source = "numero")
    @Mapping(target = "email", source = "correo")
    @Mapping(target = "hiring_id", source = "contratacion")
    Aspirante toEntity (AspiranteDto dto);
    void updateEntityFromDto(AspiranteDto dto, @MappingTarget Aspirante entity);


}
