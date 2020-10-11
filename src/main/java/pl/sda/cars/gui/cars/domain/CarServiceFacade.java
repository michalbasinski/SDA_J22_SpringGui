package pl.sda.cars.gui.cars.domain;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
class CarServiceFacade {
    private RestTemplate restTemplate;
    private String url;

    public List<Car> getCars() {
        ResponseEntity<CarServiceResponse> cars =
                restTemplate.getForEntity(url, CarServiceResponse.class);
        return cars.getBody().getCars();
    }
}
