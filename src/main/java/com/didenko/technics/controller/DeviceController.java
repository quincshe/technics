package com.didenko.technics.controller;

import com.didenko.technics.repository.entity.AbstractDevice;
import com.didenko.technics.service.DeviceService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devices")
public class DeviceController extends AbstractController<AbstractDevice, DeviceService> {

    private final DeviceService service;

    public DeviceController(DeviceService service) {
        super(service);
        this.service = service;

    }

    @GetMapping
    public ResponseEntity<List<AbstractDevice>> getAllName(@RequestParam String name) {
        return ResponseEntity.ok(service.findByName(name));
    }
}
