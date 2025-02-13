package com.didenko.technics.controller;

import com.didenko.technics.repository.entity.Computer;
import com.didenko.technics.service.ComputerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/computer")
public class ComputerController extends AbstractController<Computer, ComputerService> {

    public ComputerController(ComputerService service) {
        super(service);
    }
}
