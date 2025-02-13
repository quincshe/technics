package com.didenko.technics.repository;

import com.didenko.technics.repository.entity.AbstractDevice;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends CommonRepository<AbstractDevice> {

    @Query(value = "SELECT * FROM devices WHERE  LOWER(name) ~ LOWER(:name)", nativeQuery = true)
    List<AbstractDevice> findByName(String name);
}
