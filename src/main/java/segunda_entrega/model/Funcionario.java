package segunda_entrega.model;

import segunda_entrega.enums.Cargo;
import segunda_entrega.enums.Setor;
import segunda_entrega.vo.Endereco;
import segunda_entrega.vo.Telefone;

import java.util.List;

public class Funcionario implements IFuncionario {
    private final String nome;
    private final List<Telefone> telefones;
    private final Endereco endereco;
    private final double salario;
    private final Setor setor;
    private final Cargo cargo;

    public Funcionario(String nome, List<Telefone> telefones, Endereco endereco, double salario, Setor setor, Cargo cargo) {
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
    public List<Telefone> getTelefones() {
        return telefones;
    }

    @Override
    public Endereco getEndereco() {
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