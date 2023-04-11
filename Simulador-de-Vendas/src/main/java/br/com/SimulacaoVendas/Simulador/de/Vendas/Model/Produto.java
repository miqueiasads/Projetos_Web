package br.com.SimulacaoVendas.Simulador.de.Vendas.Model;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private float valor_unitario;
    private String material;
    private String Caracteristicas_Gerais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCaracteristicas_Gerais() {
        return Caracteristicas_Gerais;
    }

    public void setCaracteristicas_Gerais(String caracteristicas_Gerais) {
        Caracteristicas_Gerais = caracteristicas_Gerais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
