package segunda_entrega.model;

import segunda_entrega.enums.Cargo;
import segunda_entrega.enums.Setor;
import segunda_entrega.vo.Endereco;
import segunda_entrega.vo.Telefone;

import java.util.List;

public class FuncionarioTerceirizado extends Funcionario {
    private final String empresaContratada;
    private final int tempoPrevistoPermanencia;

    public FuncionarioTerceirizado(String nome, List<Telefone> telefones, Endereco endereco, double salario, Setor setor, Cargo cargo, String empresaContratada, int tempoPrevistoPermanencia) {
        super(nome, telefones, endereco, salario, setor, cargo);
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public int getTempoPrevistoPermanencia() {
        return tempoPrevistoPermanencia;
    }

    @Override
    public String toString() {
        return "FuncionarioTerceirizado{" + super.toString() +
                "empresaContratada='" + empresaContratada + '\'' +
                ", tempoPrevistoPermanencia=" + tempoPrevistoPermanencia +
                "} ";
    }
}
