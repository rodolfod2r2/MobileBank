/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.model.dao;

import br.unipe.mobilebank.model.vo.OpBancaria;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rodolfo
 */
public class OpBancariaDAO implements IOpBancaria {

    @Override
    public void salvarDados(OpBancaria op) {
        try {
            
            String insertSQL = ""
                    + "INSERT INTO operacao ("
                    + "operacao_nome,"
                    + "operacao_descricao,"
                    + "operacao_dt_criada,"
                    + "operacao_situacao,"
                    + "operacao_observacao"
                    + ") "
                    + "VALUES ("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";

            PreparedStatement insert = ConexaoDAO.getInstance().getConexao().prepareStatement(insertSQL);
            //insert.setInt(0, op.getOpBancPK());
            insert.setString(1, op.getOpBancNome());
            insert.setString(2, op.getOpBancDescricao());
            insert.setString(3, op.getOpBancDtCriada());
            insert.setString(4, String.valueOf(op.getOpBancSituacao()));
            insert.setString(5, op.getOpBancObservacao());
            insert.executeUpdate();

        } catch (SQLException e) {
        
            e.getMessage();
            
        }
    }

    @Override
    public void atualizarDados(OpBancaria op) {
       
        try {

            String updadeSQL = ""
                    + "UPDATE operacao SET "
                    + "operacao_pk = ?,"
                    + "operacao_nome = ?,"
                    + "operacao_descricao = ?,"
                    + "operacao_dt_criada = ?,"
                    + "operacao_situacao = ?,"
                    + "operacao_observacao = ?"
                    + "WHERE operacao_pk = ?";

            PreparedStatement update = ConexaoDAO.getInstance().getConexao().prepareStatement(updadeSQL);

            update.setString(1, op.getOpBancNome());
            update.setString(2, op.getOpBancDescricao());
            update.setString(3, op.getOpBancDtCriada());
            update.setString(4, String.valueOf(op.getOpBancSituacao()));
            update.setString(5, op.getOpBancObservacao());
            update.setInt(6, op.getOpBancPK());
            update.executeUpdate();

        } catch (SQLException e) {
            
            e.getMessage();
            
        }
        
    }

    @Override
    public void deletarDados(OpBancaria op) {
        
        try {

            String deleteSQL = "DELETE FROM operacao WHERE operacao_pk=?";

            PreparedStatement delete = ConexaoDAO.getInstance().getConexao().prepareStatement(deleteSQL);
            delete.setInt(1, op.getOpBancPK());
            delete.executeUpdate();
            

        } catch (SQLException e) {
           
            e.getMessage();

        }
        
    }

    @Override
    public void listarDados(OpBancaria op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarDados(OpBancaria op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
