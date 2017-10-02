/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.model.dao;

import br.unipe.mobilebank.model.vo.Conta;
import br.unipe.mobilebank.model.vo.Correntista;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodolfo
 */
public class ContaDAO implements IConta {

    @Override
    public void salvarDados(Conta c) {

        try {

            String insertSQL = ""
                    + "INSERT INTO conta ("
                    + "conta_numero,"
                    + "conta_saldo,"
                    + "conta_dt_criacao,"
                    + "conta_situacao,"
                    + "conta_tipo,"
                    + "conta_agencia,"
                    + "conta_logradouro,"
                    + "conta_numero_casa,"
                    + "conta_bairro,"
                    + "conta_cidade,"
                    + "conta_estado,"
                    + "conta_cep,"
                    + "conta_observacoes"
                    + ") "
                    + "VALUES ("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";

            PreparedStatement insert = ConexaoDAO.getInstance().getConexao().prepareStatement(insertSQL);
            //insert.setInt(0, c.getContaPK());
            insert.setString(1, c.getContaNumero());
            insert.setDouble(2, c.getContaSaldo());
            insert.setString(3, c.getContaDtCriacao());
            insert.setString(4, String.valueOf(c.getContaSituacao()));
            insert.setString(5, c.getContaTipo());
            insert.setString(6, c.getContaAgengia());
            insert.setString(7, c.getContaEndereco().getLogradouro());
            insert.setString(8, c.getContaEndereco().getNumero());
            insert.setString(9, c.getContaEndereco().getBairro());
            insert.setString(10, c.getContaEndereco().getCidade());
            insert.setString(11, c.getContaEndereco().getEstado());
            insert.setString(12, c.getContaEndereco().getCep());
            insert.setString(13, c.getContaObservacao());
            insert.executeUpdate();

        } catch (SQLException e) {

            e.getMessage();

        }

    }

    @Override
    public void atualizarDados(Conta c) {

        try {

            String updadeSQL = ""
                    + "UPDATE conta SET "
                    + "conta_numero = ?,"
                    + "conta_saldo = ?,"
                    + "conta_dt_criacao = ?,"
                    + "conta_situacao = ?,"
                    + "conta_tipo = ?,"
                    + "conta_agencia = ?,"
                    + "conta_logradouro = ?,"
                    + "conta_numero_casa = ?,"
                    + "conta_bairro = ?,"
                    + "conta_cidade = ?,"
                    + "conta_estado = ?,"
                    + "conta_cep = ?,"
                    + "conta_observacoes = ?"
                    + "WHERE conta_pk = ?";

            PreparedStatement update = ConexaoDAO.getInstance().getConexao().prepareStatement(updadeSQL);

            update.setString(1, c.getContaNumero());
            update.setDouble(2, c.getContaSaldo());
            update.setString(3, c.getContaDtCriacao());
            update.setString(4, String.valueOf(c.getContaSituacao()));
            update.setString(5, c.getContaTipo());
            update.setString(6, c.getContaAgengia());
            update.setString(7, c.getContaEndereco().getLogradouro());
            update.setString(8, c.getContaEndereco().getNumero());
            update.setString(9, c.getContaEndereco().getBairro());
            update.setString(10, c.getContaEndereco().getCidade());
            update.setString(11, c.getContaEndereco().getEstado());
            update.setString(12, c.getContaEndereco().getCep());
            update.setString(13, c.getContaObservacao());
            update.setInt(14, c.getContaPK());
            update.executeUpdate();

        } catch (SQLException e) {

            e.getMessage();

        }

    }

    @Override
    public void deletarDados(Conta c) {

        try {

            String deleteSQL = "DELETE FROM conta WHERE conta_pk=?";

            PreparedStatement delete = ConexaoDAO.getInstance().getConexao().prepareStatement(deleteSQL);
            delete.setInt(1, c.getContaPK());
            delete.executeUpdate();

        } catch (SQLException e) {
            e.getMessage();

        }
    }

    @Override
    public List<Conta> listarDados() {
        List<Conta> listaConta = new ArrayList();

        try {

            String exibirSQL = "SELECT * FROM Conta";

            PreparedStatement exibir = ConexaoDAO.getInstance().getConexao().prepareStatement(exibirSQL);

            ResultSet rs = exibir.executeQuery();

            while (rs.next()) {
                Conta conta = new Conta();
                conta.setContaPK(rs.getInt("conta_pk"));
                conta.setContaAgengia(rs.getString("conta_agencia"));
                conta.setContaNumero(rs.getString("conta_numero"));
                listaConta.add(conta);
            }

        } catch (SQLException e) {

            e.getMessage();

        }
        return listaConta;
    }

    @Override
    public List<Conta> buscarDados(Conta c) {

        List<Conta> listaConta = new ArrayList();

        try {

            String exibirSQL = "SELECT * FROM Conta WHERE conta_numero = ?";

            PreparedStatement exibir = ConexaoDAO.getInstance().getConexao().prepareStatement(exibirSQL);
            exibir.setString(1, c.getContaNumero());

            ResultSet rs = exibir.executeQuery();

            while (rs.next()) {
                Conta conta = new Conta();
                conta.setContaPK(rs.getInt("conta_pk"));
                conta.setContaAgengia(rs.getString("conta_agencia"));
                conta.setContaNumero(rs.getString("conta_numero"));
                listaConta.add(conta);
            }

        } catch (SQLException e) {

            e.getMessage();

        }
        return listaConta;
    }

}
