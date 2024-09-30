package com.copower.sp32.sensordata.domain.service;

import java.time.LocalDateTime;
import java.util.*;

import org.springframework.stereotype.Service;

import com.copower.sp32.sensordata.domain.entity.SensorData;
import com.copower.sp32.sensordata.infrastructure.repository.SensorDataRepository;

@Service
public class SensorDataService {

    private final SensorDataRepository sensorDataRepository;

     public SensorDataService(SensorDataRepository sensorDataRepository) {
        this.sensorDataRepository = sensorDataRepository;
    }

    public List<SensorData> getAllSensorData() {
        return sensorDataRepository.findAll();
    }

    public SensorData saveSensorData(SensorData sensorData) {
        sensorData.setTimestamp(LocalDateTime.now());
        return sensorDataRepository.save(sensorData);
    }

}
