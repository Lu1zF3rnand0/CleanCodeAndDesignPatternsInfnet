package terceira_entrega.builder;

import terceira_entrega.enums.Cargo;
import terceira_entrega.enums.Setor;
import terceira_entrega.vo.Telefone;
import terceira_entrega.model.FuncionarioTerceirizado;
import terceira_entrega.vo.Endereco;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioTerceirizadoBuilder {

    public static FuncionarioTerceirizadoBuilder builder() {
        return new FuncionarioTerceirizadoBuilder();
    }

    private String nome;
    private List<Telefone> telefones = new ArrayList<>();
    private Endereco endereco;
    private double salario;
    private Setor setor;
    private Cargo cargo;
    private String empresaContratada;
    private int tempoPrevistoPermanencia;

    public FuncionarioTerceirizadoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public FuncionarioTerceirizadoBuilder telefones(List<Telefone> telefones) {
        this.telefones.addAll(telefones);
        return this;
    }

    public FuncionarioTerceirizadoBuilder endereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public FuncionarioTerceirizadoBuilder salario(double salario) {
        this.salario = salario;
        return this;
    }

    public FuncionarioTerceirizadoBuilder setor(Setor setor) {
        this.setor = setor;
        return this;
    }

    public FuncionarioTerceirizadoBuilder cargo(Cargo cargo) {
        this.cargo = cargo;
        return this;
    }

    public FuncionarioTerceirizadoBuilder empresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
        return this;
    }

    public FuncionarioTerceirizadoBuilder tempoPrevistoPermanencia(int tempoPrevistoPermanencia) {
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
        return this;
    }

    public FuncionarioTerceirizado build() {
        return new FuncionarioTerceirizado(nome, telefones, endereco, salario, setor, cargo, empresaContratada, tempoPrevistoPermanencia);
    }
}


