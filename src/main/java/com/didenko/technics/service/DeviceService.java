package com.didenko.technics.service;

import com.didenko.technics.repository.DeviceRepository;
import com.didenko.technics.repository.entity.AbstractDevice;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DeviceService extends AbstractService<AbstractDevice, DeviceRepository> {

    public DeviceService(DeviceRepository repository) {
        super(repository);
    }

    public List<AbstractDevice> findByName(String name) {
        return new ArrayList<>(repository.findByName(name));
    }
}
