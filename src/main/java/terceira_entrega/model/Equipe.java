package terceira_entrega.model;

import terceira_entrega.model.interfaces.IFuncionarioComponente;

import java.util.ArrayList;
import java.util.List;

public class Equipe implements IFuncionarioComponente {
    private String nome;
    private List<IFuncionarioComponente> funcionarios = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(IFuncionarioComponente funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(IFuncionarioComponente funcionario) {
        funcionarios.remove(funcionario);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Equipe: " + nome);
        System.out.println("{");
        for (IFuncionarioComponente funcionario : funcionarios) {
            funcionario.exibirInformacoes();
        }
        System.out.println("}");
    }
}