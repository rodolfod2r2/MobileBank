package br.unipe.mobilebank.model.dao;

import br.unipe.mobilebank.model.vo.Conta;
import java.util.List;

/**
 *
 * @author Rodolfo
 */
public interface IConta {

    public void salvarDados(Conta c);

    public void atualizarDados(Conta c);

    public void deletarDados(Conta c);

    public List<Conta> listarDados();

    public List<Conta> buscarDados(Conta c);

}
