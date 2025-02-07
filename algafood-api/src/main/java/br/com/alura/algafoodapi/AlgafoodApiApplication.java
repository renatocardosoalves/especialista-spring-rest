package br.com.alura.algafoodapi;

import br.com.alura.algafoodapi.model.Cliente;
import br.com.alura.algafoodapi.service.NotificadorSMS;
import br.com.alura.algafoodapi.service.AtivacaoClienteService;
import br.com.alura.algafoodapi.service.EmissaoNotaFiscalService;

public class AlgafoodApiApplication {

    public static void main(String[] args) {
        var joao = new Cliente("João", "joao@xyz.com", "349998888");
        var maria = new Cliente("Maria", "maria@xyz.com", "1177772222");

        var notificador = new NotificadorSMS();
        var ativacaoClienteService = new AtivacaoClienteService(notificador);
        ativacaoClienteService.ativar(joao);
        ativacaoClienteService.ativar(maria);

        var emissaoNotaFiscalService = new EmissaoNotaFiscalService(notificador);
        emissaoNotaFiscalService.emitir(joao);
        emissaoNotaFiscalService.emitir(maria);
    }
}
