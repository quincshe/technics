package com.didenko.technics.service;

import com.didenko.technics.exeption.ErrorType;
import com.didenko.technics.exeption.SampleException;
import com.didenko.technics.repository.CommonRepository;
import com.didenko.technics.repository.entity.AbstractDevice;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstractService<E extends AbstractDevice, R extends CommonRepository<E>> implements
    CommonService<E> {

    protected final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public Optional<E> save(E entity) {
        return Optional.of(repository.save(entity));
    }

    @Override
    public List<E> saveAll(List<E> entities) {
        return new ArrayList<>(repository.saveAll(entities));
    }

    @Override
    public Optional<E> update(Integer id, E entity) {
        entity.setId(id);
        return Optional.of(repository.save(entity));
    }

    @Override
    public Optional<E> get(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<E> getAll() {
        return new ArrayList<>(repository.findAll());
    }

    @Override
    public Boolean deleteById(Integer id) {
        E entity = get(id)
            .orElseThrow(() -> new SampleException(
                String.format(ErrorType.ENTITY_NOT_FOUND.getDescription(), id)));
        repository.delete(entity);
        return repository.findById(entity.getId()).isEmpty();
    }

    @Override
    public Boolean deleteAll() {
        repository.deleteAll();
        return new ArrayList<>(repository.findAll()).isEmpty();
    }
}
