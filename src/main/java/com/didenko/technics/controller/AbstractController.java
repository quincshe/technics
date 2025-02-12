package com.didenko.technics.controller;

import com.didenko.technics.exeption.ErrorType;
import com.didenko.technics.exeption.SampleException;
import com.didenko.technics.repository.entity.AbstractDevice;
import com.didenko.technics.service.CommonService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/devices")
public abstract class AbstractController<E extends AbstractDevice, S extends CommonService<E>> implements
    CommonController<E> {

    private final S service;

    protected AbstractController(S service) {
        this.service = service;
    }

//    @GetMapping
//    public List<TV> findAll(){
//       return deviceService.findAll();
//    }
//
//    @PostMapping
//    public TV create (@RequestBody TV device){
//        return deviceService.create(device);
//    }


    @Override
    public ResponseEntity<E> save(@RequestBody E entity) {
        return service.save(entity).map(ResponseEntity::ok)
            .orElseThrow(() -> new SampleException(
                String.format(ErrorType.ENTITY_NOT_SAVED.getDescription(), entity.toString())
            ));
    }

    @Override
    public ResponseEntity<List<E>> saveAll(@RequestBody List<E> entities) {
        return ResponseEntity.ok(service.saveAll(entities));
    }

    @Override
    public ResponseEntity<E> update(@PathVariable(name = "id") Integer id, @RequestBody E entity) {
        return service.update(id, entity).map(ResponseEntity::ok)
            .orElseThrow(() -> new SampleException(
                String.format(ErrorType.ENTITY_NOT_UPDATED.getDescription(), entity)
            ));
    }

    @Override
    public ResponseEntity<E> get(@PathVariable(name = "id") Integer id) {
        return service.get(id).map(ResponseEntity::ok)
            .orElseThrow(() -> new SampleException(
                String.format(ErrorType.ENTITY_NOT_FOUND.getDescription(), id)
            ));
    }

    @Override
    public ResponseEntity<List<E>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @Override
    public Boolean delete(@PathVariable(name = "id") Integer id) {
        return service.deleteById(id);
    }

    @Override
    public Boolean deleteAll() {
        return service.deleteAll();
    }
}
