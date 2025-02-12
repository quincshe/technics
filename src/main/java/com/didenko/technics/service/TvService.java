package com.didenko.technics.service;

import com.didenko.technics.repository.TvRepository;
import com.didenko.technics.repository.entity.TV;
import org.springframework.stereotype.Service;

@Service
public class TvService  extends AbstractService<TV, TvRepository> {

    public TvService(TvRepository repository) {
        super(repository);
    }
}
