package com.didenko.technics.controller;

import com.didenko.technics.repository.entity.AbstractDevice;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CommonController<E extends AbstractDevice> {

    @PostMapping
    ResponseEntity<E> save(@RequestBody E entity);

    @PostMapping("/all")
    ResponseEntity<List<E>> saveAll(@RequestBody List<E> entities);

    @PutMapping(path = "{id}")
    ResponseEntity<E> update(@PathVariable(name = "id") Integer id, @RequestBody E entity);

    @GetMapping(path = "{id}")
    ResponseEntity<E> get(@PathVariable(name = "id") Integer id);

    @GetMapping("/all")
    ResponseEntity<List<E>> getAll();

    @DeleteMapping(path = "{id}")
    Boolean delete(@PathVariable(name = "id") Integer id);

    @DeleteMapping("/all")
    Boolean deleteAll();
}
