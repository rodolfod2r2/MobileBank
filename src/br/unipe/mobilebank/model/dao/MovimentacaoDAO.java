package br.unipe.mobilebank.model.dao;

import br.unipe.mobilebank.model.vo.Movimentacao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rodolfo
 */
public class MovimentacaoDAO implements IMovimentacao {

    @Override
    public void salvarDados(Movimentacao mov) {
        
        try {   
            String insertSQL = ""
                    + "INSERT INTO movimentacao ("
                    + "correntista_fk,"
                    + "conta_fk,"
                    + "operacao_fk"
                    + ") "
                    + "VALUES ("
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";

            PreparedStatement insert = ConexaoDAO.getInstance().getConexao().prepareStatement(insertSQL);
            
            insert.setInt(1, mov.getCorrentistaFK());
            insert.setInt(2, mov.getContaFK());
            insert.setInt(3, mov.getOperacaoFK());
            
            insert.executeUpdate();

        } catch (SQLException e) {
        
            e.getMessage();
            
        }
    }

    @Override
    public void atualizarDados(Movimentacao mov) {
        
        try {

            String updadeSQL = ""
                    + "UPDATE movimentacao SET "
                    + "correntista_fk = ?,"
                    + "conta_fk = ?,"
                    + "operacao_fk = ?"
                    + "WHERE movimentacao_pk = ?";

            PreparedStatement update = ConexaoDAO.getInstance().getConexao().prepareStatement(updadeSQL);

            update.setInt(1, mov.getCorrentistaFK());
            update.setInt(2, mov.getContaFK());
            update.setInt(3, mov.getOperacaoFK());
            update.setInt(4, mov.getContaFK());
            update.executeUpdate();

        } catch (SQLException e) {
            
            e.getMessage();
            
        }
        
    }

    @Override
    public void deletarDados(Movimentacao mov) {
        
        try {

            String deleteSQL = "DELETE FROM movimentacao WHERE movimentacao_pk=?";

            PreparedStatement delete = ConexaoDAO.getInstance().getConexao().prepareStatement(deleteSQL);
            delete.setInt(1, mov.getContaFK());
            delete.executeUpdate();
            

        } catch (SQLException e) {
           
            e.getMessage();

        }
       
    }

    @Override
    public void listarDados(Movimentacao mov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarDados(Movimentacao mov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
