package primeira_entrega;

import primeira_entrega.enums.Cargo;
import primeira_entrega.enums.Setor;
import primeira_entrega.model.Funcionario;
import primeira_entrega.model.FuncionarioTerceirizado;
import primeira_entrega.model.IFuncionario;
import primeira_entrega.service.Rh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("João", Arrays.asList("21 1111-1111", "21 2222-2222"), "Rua A, 123", 2000, Setor.DESENVOLVIMENTO, Cargo.PLENO);
        FuncionarioTerceirizado funcionario2 = new FuncionarioTerceirizado("Maria", Collections.singletonList("11 3333-3333"), "Rua B, 456", 1500, Setor.DEVOPS, Cargo.JUNIOR, "Empresa XYZ", 12);

        List<IFuncionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        System.out.println(funcionario1);
        System.out.println(funcionario2);

        System.out.println(funcionario1.getTelefones());

        System.out.println(funcionario2.getEmpresaContratada());
        System.out.println(funcionario2.getTempoPrevistoPermanencia());

        Rh rh = new Rh();

        rh.reajustarSalarios(funcionarios, 10);
        rh.reajustarSalario(funcionario2, 20);
    }
}
