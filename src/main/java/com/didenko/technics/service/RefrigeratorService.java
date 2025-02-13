package com.didenko.technics.service;

import com.didenko.technics.repository.RefrigeratorRepository;
import com.didenko.technics.repository.entity.Refrigerator;
import org.springframework.stereotype.Service;

@Service
public class RefrigeratorService extends AbstractService<Refrigerator, RefrigeratorRepository> {

    public RefrigeratorService(RefrigeratorRepository repository) {
        super(repository);
    }
}
