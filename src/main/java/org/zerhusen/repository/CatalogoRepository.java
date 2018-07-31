package org.zerhusen.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.CatalogoEntity;
import org.zerhusen.model.security.User;

import java.util.List;

/**
 * Created by jlganfornina on 20.03.16.
 */
public interface CatalogoRepository extends JpaRepository<CatalogoEntity, Long> {
    @Cacheable(value = "catalogo.byId")
    List<CatalogoEntity> findAll();

    CatalogoEntity findByIdEquals(Long id);
}
