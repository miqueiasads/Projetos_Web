package br.com.SimulacaoVendas.Simulador.de.Vendas.Controller;

import br.com.SimulacaoVendas.Simulador.de.Vendas.Model.Cliente;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class Cliente_controller {

    @PostMapping(value = "/novocliente")
    public String SalvarCliente(@RequestBody Cliente cliente){
        return null;
    }
    @DeleteMapping(value = "remover/{cpf}")
    public String DeletarCliente(@PathVariable(value = "cpf")Integer cpf){
        return null;
        //Buscar o cliente pelo CPF e assim deleta-lo
    }
    @GetMapping(value = "/meusclientes")
    public void ListarClientes(){

    }

    public String AtualizarCliente(){
        return null;

    }

}
