package interfaces;

import exceptions.ItemIndisponivelException;

/**
 * interface que define a assinatura de métodos que padronizam o empréstimo de itens
 */
public interface IEmprestavel {
    /**
     * método que empresta o item
     * @throws ItemIndisponivelException se o item não estiver disponível
     */
    void emprestar() throws ItemIndisponivelException;
    
    /**
     * método que devolve o item
     */
    void devolver();
}
