package org.rsosa.gestion_reportes.persistence.crud;

import org.rsosa.gestion_reportes.persistence.entity.Reporte;
import org.springframework.data.repository.CrudRepository;

public interface CrudReporteEntity extends CrudRepository<Reporte, Long> {
    Iterable<Reporte> findAllByVecino(String vecino);
    Iterable<Reporte> findAllByEstado(String estado);
    Iterable<Reporte> findAllByPersonalAsignado(String persona);
    Iterable<Reporte> findAllByTipoReporte(String tipoReporte);
}