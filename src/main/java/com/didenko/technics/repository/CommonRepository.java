package com.didenko.technics.repository;

import com.didenko.technics.repository.entity.AbstractDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepository<E extends AbstractDevice> extends JpaRepository<E, Integer> {

}
