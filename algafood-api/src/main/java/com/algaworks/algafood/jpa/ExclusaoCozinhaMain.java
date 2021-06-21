package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class ExclusaoCozinhaMain {

    public static void main(String[] args) {
        var applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        var cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        var cozinha = new Cozinha();
        cozinha.setId(1L);

        cadastroCozinha.remover(cozinha);
    }

}
