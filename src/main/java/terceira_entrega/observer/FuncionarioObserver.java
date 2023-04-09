package terceira_entrega.observer;

import terceira_entrega.model.interfaces.IFuncionario;

public interface FuncionarioObserver {
    void notificarReajuste(IFuncionario funcionario);
}
