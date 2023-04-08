package terceira_entrega.model;

import terceira_entrega.enums.Cargo;
import terceira_entrega.enums.Setor;
import terceira_entrega.observer.FuncionarioObserver;
import terceira_entrega.vo.Endereco;
import terceira_entrega.vo.Telefone;

import java.util.ArrayList;
import java.util.List;

public class Funcionario implements IFuncionario {
    private final String nome;
    private final List<Telefone> telefones;
    private final Endereco endereco;
    private double salario;
    private final Setor setor;
    private final Cargo cargo;

    private final List<FuncionarioObserver> observadores = new ArrayList<>();

    public Funcionario(String nome, List<Telefone> telefones, Endereco endereco, double salario, Setor setor, Cargo cargo) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    public void adicionarObservador(FuncionarioObserver observador) {
        observadores.add(observador);
    }

    public void removerObservador(FuncionarioObserver observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (FuncionarioObserver observador : observadores) {
            observador.notificarReajuste(this);
        }
    }
    @Override
    public void setSalario(double salario) {
        this.salario = salario;
        notificarObservadores();
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