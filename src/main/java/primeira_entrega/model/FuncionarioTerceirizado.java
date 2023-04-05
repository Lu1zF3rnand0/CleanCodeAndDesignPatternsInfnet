package primeira_entrega.model;

import primeira_entrega.enums.Cargo;
import primeira_entrega.enums.Setor;

import java.util.List;

public class FuncionarioTerceirizado implements IFuncionario {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private double salario;
    private Setor setor;
    private Cargo cargo;
    private String empresaContratada;
    private int tempoPrevistoPermanencia;

    public FuncionarioTerceirizado(String nome, List<String> telefones, String endereco, double salario, Setor setor, Cargo cargo, String empresaContratada, int tempoPrevistoPermanencia) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public List<String> getTelefones() {
        return telefones;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public Setor getSetor() {
        return setor;
    }

    @Override
    public Cargo getCargo() {
        return cargo;
    }
}
