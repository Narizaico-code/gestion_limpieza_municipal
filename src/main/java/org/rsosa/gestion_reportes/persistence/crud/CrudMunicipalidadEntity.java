package org.rsosa.gestion_reportes.persistence.crud;

import org.rsosa.gestion_reportes.persistence.entity.Munipalidad;
import org.springframework.data.repository.CrudRepository;

public interface CrudMunicipalidadEntity extends CrudRepository<Munipalidad, Long> {
    Munipalidad findById(long id);
}
