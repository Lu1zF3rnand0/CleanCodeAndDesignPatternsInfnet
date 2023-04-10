package primeira_entrega.service;

import primeira_entrega.model.FuncionarioTerceirizado;
import primeira_entrega.model.IFuncionario;

import java.util.List;

public class Rh {

    //Reajusta o salario de uma lista de funcionarios
    public void reajustarSalarios(List<IFuncionario> funcionarios, double percentualReajuste) {
        for (IFuncionario funcionario : funcionarios) {
            if (!(funcionario instanceof FuncionarioTerceirizado)) {
                double novoSalario = funcionario.getSalario() * (1 + percentualReajuste / 100);
                funcionario.setSalario(novoSalario);
                System.out.println("Funcionário " + funcionario.getNome() + " teve seu salário reajustado para " + novoSalario);
            }
        }
    }

    //Reajusta o salario de apenas um funcionario
    public void reajustarSalario(IFuncionario funcionario, double percentualReajuste) {
        if (!(funcionario instanceof FuncionarioTerceirizado)) {
            double novoSalario = funcionario.getSalario() * (1 + percentualReajuste / 100);
            funcionario.setSalario(novoSalario);
            System.out.println("Funcionário " + funcionario.getNome() + " teve seu salário reajustado para " + novoSalario);
        }

    }
}