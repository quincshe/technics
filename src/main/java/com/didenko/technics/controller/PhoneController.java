package com.didenko.technics.controller;

import com.didenko.technics.repository.entity.Phone;
import com.didenko.technics.service.PhoneService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phone")
public class PhoneController extends AbstractController<Phone, PhoneService> {

    public PhoneController(PhoneService service) {
        super(service);
    }
}
