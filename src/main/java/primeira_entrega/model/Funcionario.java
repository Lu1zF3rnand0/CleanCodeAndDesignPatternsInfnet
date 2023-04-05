package primeira_entrega.model;

import primeira_entrega.enums.Cargo;
import primeira_entrega.enums.Setor;

import java.util.List;

public class Funcionario implements IFuncionario {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private double salario;
    private Setor setor;
    private Cargo cargo;

    public Funcionario(String nome, List<String> telefones, String endereco, double salario, Setor setor, Cargo cargo) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
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