package org.rsosa.gestion_reportes.persistence.crud;

import org.rsosa.gestion_reportes.persistence.entity.Aspirante;
import org.springframework.data.repository.CrudRepository;

public interface CrudAspiranteEntity extends CrudRepository<Aspirante, Long> {
    Aspirante FindFirstByEmail(String email);
}
