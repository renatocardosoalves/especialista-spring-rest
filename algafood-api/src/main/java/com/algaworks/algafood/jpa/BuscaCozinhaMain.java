package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class BuscaCozinhaMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuscaCozinhaMain.class);

    public static void main(String[] args) {
        var applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        var cozinhas = applicationContext.getBean(CozinhaRepository.class);

        var cozinha = cozinhas.buscar(1L);

        LOGGER.info("id: {}, nome: {}", cozinha.getId(), cozinha.getNome());
    }

}
