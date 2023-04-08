package terceira_entrega.model;

import terceira_entrega.enums.Cargo;
import terceira_entrega.enums.Setor;
import terceira_entrega.vo.Endereco;
import terceira_entrega.vo.Telefone;

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

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                ", endereco=" + endereco +
                ", salario=" + salario +
                ", setor=" + setor +
                ", cargo=" + cargo +
                '}';
    }
}