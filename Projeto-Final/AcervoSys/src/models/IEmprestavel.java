package models;

import exceptions.ItemIndisponivelException;

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
