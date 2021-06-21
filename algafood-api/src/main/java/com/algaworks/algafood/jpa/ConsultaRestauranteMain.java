package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class ConsultaRestauranteMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaRestauranteMain.class);

    public static void main(String[] args) {
        var applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        var restaurantes = applicationContext.getBean(RestauranteRepository.class);

        restaurantes.listar()
                .forEach(restaurante -> LOGGER.info(">>> {}", restaurante));
    }

}
