package primeira_entrega.model;

import primeira_entrega.enums.Cargo;
import primeira_entrega.enums.Setor;

import java.util.List;

public interface IFuncionario {
    String getNome();

    List<String> getTelefones();

    String getEndereco();

    double getSalario();

    Setor getSetor();

    Cargo getCargo();
}