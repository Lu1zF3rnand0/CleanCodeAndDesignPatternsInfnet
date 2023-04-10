package segunda_entrega;

import segunda_entrega.enums.Cargo;
import segunda_entrega.enums.Setor;
import segunda_entrega.model.Funcionario;
import segunda_entrega.model.FuncionarioTerceirizado;
import segunda_entrega.model.IFuncionario;
import segunda_entrega.service.Rh;
import segunda_entrega.vo.Endereco;
import segunda_entrega.vo.Telefone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionarioCLT = new Funcionario("João", List.of(new Telefone("21", "2020-3030")), new Endereco("RJ", "Cidade A", "Bairro B"), 2000, Setor.DESENVOLVIMENTO, Cargo.PLENO);
        FuncionarioTerceirizado funcionarioPJ = new FuncionarioTerceirizado("Maria", List.of(new Telefone("21", "2020-3030")), new Endereco("SP", "Cidade C", "Bairro D"), 1500, Setor.DEVOPS, Cargo.JUNIOR, "Empresa XYZ", 12);

        List<IFuncionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionarioCLT);
        funcionarios.add(funcionarioPJ);

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);

        System.out.println(funcionarioCLT.getTelefones());

        System.out.println(funcionarioPJ.getEmpresaContratada());
        System.out.println(funcionarioPJ.getTempoPrevistoPermanencia());

        Rh rh = new Rh();

        rh.reajustarSalarios(funcionarios, 10);

        rh.reajustarSalario(funcionarioCLT, 20);
        rh.reajustarSalario(funcionarioPJ, 20);
    }
}
