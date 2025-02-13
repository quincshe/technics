package com.didenko.technics.service;

import com.didenko.technics.repository.PhoneRepository;
import com.didenko.technics.repository.entity.Phone;
import org.springframework.stereotype.Service;

@Service
public class PhoneService extends AbstractService<Phone, PhoneRepository> {

    public PhoneService(PhoneRepository repository) {
        super(repository);
    }
}
