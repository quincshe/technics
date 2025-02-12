package com.didenko.technics.service;

import com.didenko.technics.repository.entity.AbstractDevice;
import java.util.List;
import java.util.Optional;

public interface CommonService <E extends AbstractDevice> {
    Optional<E> save(E entity);

    List<E> saveAll(List<E> entities);

    Optional<E> update(Integer id, E entity);

    Optional<E> get(Integer id);

    List<E> getAll();

    Boolean deleteById(Integer id);

    Boolean deleteAll();
}
