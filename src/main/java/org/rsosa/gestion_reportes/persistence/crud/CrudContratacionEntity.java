package org.rsosa.gestion_reportes.persistence.crud;

import org.rsosa.gestion_reportes.persistence.entity.Contratacion;
import org.springframework.data.repository.CrudRepository;

public interface CrudContratacionEntity extends CrudRepository<Contratacion, Long> {
    Contratacion FindFirstByNombre(String nombre);
}
