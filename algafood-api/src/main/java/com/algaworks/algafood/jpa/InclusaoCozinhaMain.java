package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class InclusaoCozinhaMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(InclusaoCozinhaMain.class);

    public static void main(String[] args) {
        var applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        var cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        var cozinha1 = new Cozinha();
        cozinha1.setNome("Brasileira");

        var cozinha2 = new Cozinha();
        cozinha2.setNome("Japonesa");

        cozinha1 = cadastroCozinha.salvar(cozinha1);
        LOGGER.info(">>> id: {}, nome: {}", cozinha1.getId(), cozinha1.getNome());

        cozinha2 = cadastroCozinha.salvar(cozinha2);
        LOGGER.info(">>> id: {}, nome: {}", cozinha2.getId(), cozinha2.getNome());
    }

}
