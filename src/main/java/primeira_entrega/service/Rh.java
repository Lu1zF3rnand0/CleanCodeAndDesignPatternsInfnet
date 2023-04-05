package primeira_entrega.service;

import primeira_entrega.model.FuncionarioTerceirizado;
import primeira_entrega.model.IFuncionario;

import java.util.List;

public class Rh {

    public void reajustarSalarios(List<IFuncionario> funcionarios, double percentualReajuste) {
        for (IFuncionario funcionario : funcionarios) {
            if (!(funcionario instanceof FuncionarioTerceirizado)) {
                double novoSalario = funcionario.getSalario() * (1 + percentualReajuste / 100);
                System.out.println("Funcionário " + funcionario.getNome() + " teve seu salário reajustado para " + novoSalario);
            }
        }
    }

    public void reajustarSalario(IFuncionario funcionario, double percentualReajuste) {
        if (!(funcionario instanceof FuncionarioTerceirizado)) {
            double novoSalario = funcionario.getSalario() * (1 + percentualReajuste / 100);
            System.out.println("Funcionário " + funcionario.getNome() + " teve seu salário reajustado para " + novoSalario);
        }

    }
}