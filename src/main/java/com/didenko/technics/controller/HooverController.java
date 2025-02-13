package com.didenko.technics.controller;

import com.didenko.technics.repository.entity.Hoover;
import com.didenko.technics.service.HooverService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hoover")
public class HooverController extends AbstractController<Hoover, HooverService> {

    public HooverController(HooverService service) {
        super(service);
    }
}
