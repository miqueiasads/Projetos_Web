package br.com.SimulacaoVendas.Simulador.de.Vendas.Controller;

import br.com.SimulacaoVendas.Simulador.de.Vendas.Model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sistema")
public class Produto_controller {

    @GetMapping(value = "/cadastro")
    public String CadastroProduto(@RequestBody Produto produto){

        return "Produto Cadastrado com Sucesso!";
    }
    @GetMapping(value = "/listarproduto")
    public void ListarProdutos(){
        //retorna a Lista de produtos
    }
    @GetMapping(value = "/deletarproduto")
    public String DeletarProduto(){

        return "Produto Deletado com Sucesso!";
    }
    @GetMapping(value = "/editarproduto")
    public void EditarProduto(){

    }

}
