package com.didenko.technics.controller;

import com.didenko.technics.repository.entity.Refrigerator;
import com.didenko.technics.service.RefrigeratorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/refrigerator")
public class RefrigeratorController extends AbstractController<Refrigerator, RefrigeratorService> {

    public RefrigeratorController(RefrigeratorService service) {
        super(service);
    }
}
