package com.didenko.technics.service;

import com.didenko.technics.repository.HooverRepository;
import com.didenko.technics.repository.entity.Hoover;
import org.springframework.stereotype.Service;

@Service
public class HooverService extends AbstractService<Hoover, HooverRepository> {

    public HooverService(HooverRepository repository) {
        super(repository);
    }
}
