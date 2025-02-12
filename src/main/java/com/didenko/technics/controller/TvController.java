package com.didenko.technics.controller;

import com.didenko.technics.repository.entity.TV;
import com.didenko.technics.service.TvService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tv")
public class TvController extends AbstractController<TV, TvService> {

    public TvController(TvService service) {
        super(service);
    }
}
