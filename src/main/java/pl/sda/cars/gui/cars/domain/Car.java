package pl.sda.cars.gui.cars.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Car {
    private String brand;
    private String model;
    private String vin;
    private String plateNumber;
}
