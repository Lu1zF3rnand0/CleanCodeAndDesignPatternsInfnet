package terceira_entrega;

import terceira_entrega.builder.FuncionarioTerceirizadoBuilder;
import terceira_entrega.enums.Cargo;
import terceira_entrega.enums.Setor;
import terceira_entrega.model.Funcionario;
import terceira_entrega.model.FuncionarioTerceirizado;
import terceira_entrega.service.Rh;
import terceira_entrega.vo.Endereco;
import terceira_entrega.vo.Telefone;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Luiz", List.of(new Telefone("21", "8888-7777")), new Endereco("RJ", "Cidade A", "Bairro A"), 5000, Setor.DESENVOLVIMENTO, Cargo.PLENO);

        FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizadoBuilder()
                .nome("Maria")
                .telefones(List.of(new Telefone("21", "8888-8888")))
                .endereco(new Endereco("RJ", "Cidade A", "Bairro A"))
                .salario(1500.0)
                .setor(Setor.DEVOPS)
                .cargo(Cargo.JUNIOR)
                .empresaContratada("Terceirizada ada")
                .tempoPrevistoPermanencia(6)
                .build();

        Rh rh = Rh.getInstancia();

        funcionario.adicionarObservador(rh);
        rh.reajustarSalario(funcionario, 20);

        funcionarioTerceirizado.adicionarObservador(rh);
        rh.reajustarSalario(funcionarioTerceirizado, 20);

        System.out.println(funcionario);
        System.out.println(funcionarioTerceirizado);

    }
}
