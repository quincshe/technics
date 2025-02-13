package com.didenko.technics.service;

import com.didenko.technics.repository.ComputerRepository;
import com.didenko.technics.repository.entity.Computer;
import org.springframework.stereotype.Service;

@Service
public class ComputerService extends AbstractService<Computer, ComputerRepository> {

    public ComputerService(ComputerRepository repository) {
        super(repository);
    }
}
