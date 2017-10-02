package br.unipe.mobilebank.model.dao;

import br.unipe.mobilebank.model.vo.OpBancaria;

/**
 *
 * @author Rodolfo
 */
public interface IOpBancaria {
    
    public void salvarDados(OpBancaria op);
    public void atualizarDados(OpBancaria op);
    public void deletarDados(OpBancaria op);
    public void listarDados(OpBancaria op);
    public void buscarDados(OpBancaria op);
    
}
