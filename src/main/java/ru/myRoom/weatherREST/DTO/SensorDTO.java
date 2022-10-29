package ru.myRoom.weatherREST.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class SensorDTO {
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters long")
    @NotEmpty(message = "Name shouldn't be empty")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
