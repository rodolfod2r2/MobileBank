/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.model.dao;

import br.unipe.mobilebank.model.vo.Correntista;
import br.unipe.mobilebank.model.vo.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodolfo
 */
public class CorrentistaDAO implements ICorrentista {

    @Override
    public void salvarDados(Correntista co) {

        try {

            String insertSQL = ""
                    + "INSERT INTO correntista ("
                    + "correntista_nome,"
                    + "correntista_rg,"
                    + "correntista_cpf,"
                    + "correntista_est_civil,"
                    + "correntista_sexo,"
                    + "correntista_situacao,"
                    + "correntista_dt_nasc,"
                    + "correntista_dt_cad,"
                    + "correntista_profissao,"
                    + "correntista_email,"
                    + "correntista_telefone,"
                    + "correntista_logradouro,"
                    + "correntista_numero_casa,"
                    + "correntista_bairro,"
                    + "correntista_cidade,"
                    + "correntista_estado,"
                    + "correntista_cep,"
                    + "correntista_observacoes"
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
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";

            String verificaSQL = "SELECT * FROM correntista "
                    + "WHERE correntista_nome = ? AND "
                    + "correntista_rg = ? AND "
                    + "correntista_cpf = ?";

            PreparedStatement verifica = ConexaoDAO.getInstance().getConexao().prepareStatement(verificaSQL);

            verifica.setString(1, co.getCorrentistaNome());
            verifica.setString(2, co.getCorrentistaRG());
            verifica.setString(3, co.getCorrentistaCPF());

            PreparedStatement insert = ConexaoDAO.getInstance().getConexao().prepareStatement(insertSQL);

            insert.setString(1, co.getCorrentistaNome());
            insert.setString(2, co.getCorrentistaRG());
            insert.setString(3, co.getCorrentistaCPF());
            insert.setString(4, String.valueOf(co.getCorrentistaEstCivil()));
            insert.setString(5, String.valueOf(co.getCorrentistaSexo()));
            insert.setString(6, String.valueOf(co.getCorrentistaSituacao()));
            insert.setString(7, co.getCorrentistaDtNasc());
            insert.setString(8, co.getCorrentistaDtCadBanco());
            insert.setString(9, co.getCorrentistaProfissao());
            insert.setString(10, co.getCorrentistaEmail());
            insert.setString(11, co.getCorrentistaTelefone());
            insert.setString(12, co.getCorrentistaEndereco().getLogradouro());
            insert.setString(13, co.getCorrentistaEndereco().getNumero());
            insert.setString(14, co.getCorrentistaEndereco().getBairro());
            insert.setString(15, co.getCorrentistaEndereco().getCidade());
            insert.setString(16, co.getCorrentistaEndereco().getEstado());
            insert.setString(17, co.getCorrentistaEndereco().getCep());
            insert.setString(18, co.getCorrentistaObservacao());

            ResultSet rs = verifica.executeQuery();

            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "já existe");

            } else {

                insert.executeUpdate();
                JOptionPane.showMessageDialog(null, "salvo");

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Ocorreu um erro " + e.getMessage());

        }

    }

    @Override
    public void atualizarDados(Correntista co) {

        try {

            String updadeSQL = ""
                    + "UPDATE correntista SET "
                    + "correntista_nome = ?,"
                    + "correntista_rg = ?,"
                    + "correntista_cpf = ?,"
                    + "correntista_est_civil = ?,"
                    + "correntista_sexo = ?,"
                    + "correntista_situacao = ?,"
                    + "correntista_dt_nasc = ?,"
                    + "correntista_dt_cad = ?,"
                    + "correntista_profissao = ?,"
                    + "correntista_email = ?,"
                    + "correntista_telefone = ?,"
                    + "correntista_logradouro = ?,"
                    + "correntista_numero_casa = ?,"
                    + "correntista_bairro = ?,"
                    + "correntista_cidade = ?,"
                    + "correntista_estado = ?,"
                    + "correntista_cep = ?,"
                    + "correntista_observacoes = ?"
                    + "WHERE correntista_pk = ?";

            PreparedStatement update = ConexaoDAO.getInstance().getConexao().prepareStatement(updadeSQL);

            update.setString(1, co.getCorrentistaNome());
            update.setString(2, co.getCorrentistaRG());
            update.setString(3, co.getCorrentistaCPF());
            update.setString(4, co.getCorrentistaEstCivil());
            update.setString(5, co.getCorrentistaSexo());
            update.setString(6, String.valueOf(co.getCorrentistaSituacao()));
            update.setString(7, co.getCorrentistaDtNasc());
            update.setString(8, co.getCorrentistaDtCadBanco());
            update.setString(9, co.getCorrentistaProfissao());
            update.setString(10, co.getCorrentistaEmail());
            update.setString(11, co.getCorrentistaTelefone());
            update.setString(12, co.getCorrentistaEndereco().getLogradouro());
            update.setString(13, co.getCorrentistaEndereco().getNumero());
            update.setString(14, co.getCorrentistaEndereco().getBairro());
            update.setString(15, co.getCorrentistaEndereco().getCidade());
            update.setString(16, co.getCorrentistaEndereco().getEstado());
            update.setString(17, co.getCorrentistaEndereco().getCep());
            update.setString(18, co.getCorrentistaObservacao());
            update.setInt(19, co.getCorrentistaPK());
            update.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado");

        } catch (SQLException e) {

            e.getMessage();
            JOptionPane.showMessageDialog(null, "erro ao Atualizar");

        }

    }

    @Override
    public void deletarDados(Correntista co) {

        try {

            String verificaSQL = "SELECT * FROM correntista WHERE correntista_pk = ?";

            String deleteSQL = "DELETE FROM correntista WHERE correntista_pk=?";

            PreparedStatement verifica = ConexaoDAO.getInstance().getConexao().prepareStatement(verificaSQL);

            verifica.setInt(1, co.getCorrentistaPK());

            PreparedStatement delete = ConexaoDAO.getInstance().getConexao().prepareStatement(deleteSQL);
            delete.setInt(1, co.getCorrentistaPK());

            ResultSet rs = verifica.executeQuery();

            if (rs.next()) {

                delete.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Removido");

            } else {

                JOptionPane.showMessageDialog(null, "Esse Registro não Existe ou já foi Removido");

            }

        } catch (SQLException e) {

            e.getMessage();

        }

    }

    @Override
    public List<Correntista> listarDados() {

        List<Correntista> listaCorrentista = new ArrayList();

        try {

            String exibirSQL = "SELECT * FROM correntista";

            PreparedStatement exibir = ConexaoDAO.getInstance().getConexao().prepareStatement(exibirSQL);

            ResultSet rs = exibir.executeQuery();

            while (rs.next()) {
                Correntista correntista = new Correntista();
                correntista.setCorrentistaPK(rs.getInt("correntista_pk"));
                correntista.setCorrentistaNome(rs.getString("correntista_nome"));
                correntista.setCorrentistaCPF(rs.getString("correntista_cpf"));
                listaCorrentista.add(correntista);
            }

        } catch (SQLException e) {

            e.getMessage();

        }
        return listaCorrentista;

    }

    @Override
    public List<Correntista> buscarDados(Correntista co) {
        
        List<Correntista> listaCorrentista = new ArrayList();

        try {

            String exibirSQL = "SELECT * FROM correntista WHERE correntista_nome LIKE ? ESCAPE '!' ";

            PreparedStatement exibir = ConexaoDAO.getInstance().getConexao().prepareStatement(exibirSQL);
            exibir.setString(1, "%" + co.getCorrentistaNome().replace("%", "!%") + "%");

            ResultSet rs = exibir.executeQuery();

            while (rs.next()) {
                Correntista correntista = new Correntista();
                correntista.setCorrentistaPK(rs.getInt("correntista_pk"));
                correntista.setCorrentistaNome(rs.getString("correntista_nome"));
                correntista.setCorrentistaCPF(rs.getString("correntista_cpf"));
                listaCorrentista.add(correntista);
            }

        } catch (SQLException e) {

            e.getMessage();

        }
        return listaCorrentista;
    }

    

}
