package br.unipe.mobilebank.model.dao;

import br.unipe.mobilebank.model.vo.Correntista;
import java.util.List;

/**
 *
 * @author Rodolfo
 */
public interface ICorrentista {

    public void salvarDados(Correntista co);

    public void atualizarDados(Correntista co);

    public void deletarDados(Correntista co);

    public List<Correntista> listarDados();

    public List<Correntista> buscarDados(Correntista co);

}
