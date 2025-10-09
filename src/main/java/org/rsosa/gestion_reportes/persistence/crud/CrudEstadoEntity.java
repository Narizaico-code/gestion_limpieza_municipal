package org.rsosa.gestion_reportes.persistence.crud;

import org.rsosa.gestion_reportes.persistence.entity.Estado;
import org.springframework.data.repository.CrudRepository;

public interface CrudEstadoEntity extends CrudRepository<Estado, Long> {
    Estado findFirstByNombre(String nombre);
}