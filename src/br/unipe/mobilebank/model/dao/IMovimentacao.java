package br.unipe.mobilebank.model.dao;

import br.unipe.mobilebank.model.vo.Movimentacao;

/**
 *
 * @author Rodolfo
 */
public interface IMovimentacao {
    
    public void salvarDados(Movimentacao mov);
    public void atualizarDados(Movimentacao mov);
    public void deletarDados(Movimentacao mov);
    public void listarDados(Movimentacao mov);
    public void buscarDados(Movimentacao mov);
    
}
