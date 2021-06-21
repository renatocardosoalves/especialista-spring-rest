package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class ConsultaPermissaoMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaPermissaoMain.class);

    public static void main(String[] args) {
        var applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        var permissoes = applicationContext.getBean(PermissaoRepository.class);

        permissoes.listar()
                .forEach(permissao -> LOGGER.info(">>> {}", permissao));
    }

}
