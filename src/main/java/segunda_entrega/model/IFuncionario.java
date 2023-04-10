package segunda_entrega.model;

import segunda_entrega.enums.Cargo;
import segunda_entrega.enums.Setor;
import segunda_entrega.vo.Endereco;
import segunda_entrega.vo.Telefone;

import java.util.List;

public interface IFuncionario {
    String getNome();

    List<Telefone> getTelefones();

    Endereco getEndereco();

    double getSalario();

    Setor getSetor();

    Cargo getCargo();

    void setSalario(double salario);
}