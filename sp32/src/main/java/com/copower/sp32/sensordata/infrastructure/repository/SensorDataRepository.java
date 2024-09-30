package com.copower.sp32.sensordata.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.copower.sp32.sensordata.domain.entity.SensorData;

public interface SensorDataRepository extends JpaRepository<SensorData, Long> {

}
