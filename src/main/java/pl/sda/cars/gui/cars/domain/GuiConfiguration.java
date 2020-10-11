package pl.sda.cars.gui.cars.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class GuiConfiguration {

    @Value("${car.service.url}")
    private String url;

    @Bean
    CarServiceFacade carServiceFacade(RestTemplate restTemplate) {
        return new CarServiceFacade(restTemplate, url);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
