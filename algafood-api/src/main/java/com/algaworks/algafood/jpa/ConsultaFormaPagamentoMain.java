package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class ConsultaFormaPagamentoMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaFormaPagamentoMain.class);

    public static void main(String[] args) {
        var applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        var formasPagamento = applicationContext.getBean(FormaPagamentoRepository.class);

        formasPagamento.listar()
                .forEach(formaPagamento -> LOGGER.info(">>> {}", formaPagamento));
    }

}
