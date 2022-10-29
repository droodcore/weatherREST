package ru.myRoom.weatherREST.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.myRoom.weatherREST.models.Measurement;

public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
