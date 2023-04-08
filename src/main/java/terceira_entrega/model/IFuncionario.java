package terceira_entrega.model;

import terceira_entrega.enums.Cargo;
import terceira_entrega.enums.Setor;
import terceira_entrega.vo.Endereco;
import terceira_entrega.vo.Telefone;

import java.util.List;

public interface IFuncionario {
    String getNome();

    List<Telefone> getTelefones();

    Endereco getEndereco();

    double getSalario();

    Setor getSetor();

    Cargo getCargo();

    String toString();

    void setSalario(double salario);
}