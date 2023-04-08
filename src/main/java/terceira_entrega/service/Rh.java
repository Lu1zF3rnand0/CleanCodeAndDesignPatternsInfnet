package terceira_entrega.service;

import terceira_entrega.model.FuncionarioTerceirizado;
import terceira_entrega.model.IFuncionario;

import java.util.List;

public class Rh {

    public boolean verificarSeInstanciaNaoEhFuncionarioTerceirizado(IFuncionario funcionario) {
        return !(funcionario instanceof FuncionarioTerceirizado);
    }

    public void reajustarSalario(IFuncionario funcionario, double percentualReajuste) {
        if (verificarSeInstanciaNaoEhFuncionarioTerceirizado(funcionario)) {
            double novoSalario = funcionario.getSalario() * (1 + percentualReajuste / 100);
            System.out.println("Funcionário " + funcionario.getNome() + " teve seu salário reajustado para " + novoSalario);
        }

    }

    public void reajustarSalarios(List<IFuncionario> funcionarios, double percentualReajuste) {
        for (IFuncionario funcionario : funcionarios) {
            reajustarSalario(funcionario, percentualReajuste);
        }
    }
}