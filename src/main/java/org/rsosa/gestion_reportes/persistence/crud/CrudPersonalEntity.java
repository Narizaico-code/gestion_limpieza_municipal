package org.rsosa.gestion_reportes.persistence.crud;

import org.rsosa.gestion_reportes.persistence.entity.Personal;
import org.springframework.data.repository.CrudRepository;

public interface CrudPersonalEntity extends CrudRepository<Personal, Long> {
    Personal findFirstByEmail(String email);
}
