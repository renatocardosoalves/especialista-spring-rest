package br.com.alura.algafoodapi.configuration;

import br.com.alura.algafoodapi.service.AtivacaoClienteService;
import br.com.alura.algafoodapi.service.Notificador;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AtivacaoClienteServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
        return new AtivacaoClienteService(notificador);
    }
}