package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.repository.CidadeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class ConsultaCidadeMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaCidadeMain.class);

    public static void main(String[] args) {
        var applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        var cidades = applicationContext.getBean(CidadeRepository.class);

        cidades.listar()
                .forEach(cidade -> LOGGER.info(">>> {}", cidade));
    }

}
