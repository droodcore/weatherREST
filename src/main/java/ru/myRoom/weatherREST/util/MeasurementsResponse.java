package ru.myRoom.weatherREST.util;

import ru.myRoom.weatherREST.DTO.MeasurementDTO;
import ru.myRoom.weatherREST.models.Measurement;

import java.util.List;

public class MeasurementsResponse {
    List<MeasurementDTO> measurements;

    public MeasurementsResponse(List<MeasurementDTO> measurements) {
        this.measurements = measurements;
    }

    public List<MeasurementDTO> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<MeasurementDTO> measurements) {
        this.measurements = measurements;
    }
}
