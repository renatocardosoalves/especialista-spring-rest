package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class ConsultaCozinhaMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaCozinhaMain.class);

    public static void main(String[] args) {
        var applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        var cozinhas = applicationContext.getBean(CozinhaRepository.class);

        cozinhas.listar()
                .forEach(cozinha -> LOGGER.info(">>> {}", cozinha.getNome()));
    }

}
