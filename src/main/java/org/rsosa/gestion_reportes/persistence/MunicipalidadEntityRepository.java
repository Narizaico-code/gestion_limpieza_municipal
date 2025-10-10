package org.rsosa.gestion_reportes.persistence;

import org.rsosa.gestion_reportes.dominio.dto.AdministradorDto;
import org.rsosa.gestion_reportes.dominio.dto.MunicipalidadDto;
import org.rsosa.gestion_reportes.dominio.repository.AdministradorRepository;
import org.rsosa.gestion_reportes.dominio.repository.MunicipalidadRepository;
import org.rsosa.gestion_reportes.persistence.crud.CrudAdministradorEntity;
import org.rsosa.gestion_reportes.persistence.crud.CrudMunicipalidadEntity;
import org.rsosa.gestion_reportes.persistence.entity.Administrador;
import org.rsosa.gestion_reportes.web.mapper.AdministradorMapper;
import org.rsosa.gestion_reportes.web.mapper.MunicipalidadMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MunicipalidadEntityRepository implements MunicipalidadRepository {
private final MunicipalidadRepository municipalidadRepository;
private final MunicipalidadMapper municipalidadMapper;
    public MunicipalidadEntityRepository(MunicipalidadRepository municipalidadRepository, MunicipalidadMapper municipalidadMapper) {
        this.municipalidadRepository = municipalidadRepository;
        this.municipalidadMapper = municipalidadMapper;
    }

    @Override
    public List<MunicipalidadDto> obtenerTodo() {
        return this.municipalidadRepository.obtenerTodo();
    }

    @Override
    public MunicipalidadDto obtenerMunicipalidadPorId(Long id) {
        return this.municipalidadRepository.obtenerMunicipalidadPorId(id);
    }

    @Override
    public MunicipalidadDto guardarMunicipalidad(MunicipalidadDto municipalidadDto) {
        return this.municipalidadRepository.guardarMunicipalidad(municipalidadDto);
    }

    @Override
    public MunicipalidadDto actualizarMunicipalidad(Long id, MunicipalidadDto municipalidadDto) {
        return this.municipalidadRepository.actualizarMunicipalidad(id, municipalidadDto);
    }

    @Override
    public void eliminarMunicipalidad(Long id) {
        this.municipalidadRepository.eliminarMunicipalidad(id);
    }
}