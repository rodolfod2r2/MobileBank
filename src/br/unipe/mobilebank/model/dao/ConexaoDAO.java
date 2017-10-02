/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodolfo
 */
public class ConexaoDAO {

    private Connection conexao;
    private String url;
    private String usuario;
    private String senha;
    private static ConexaoDAO instance;

    private ConexaoDAO() {

        try {
            Properties propriedades = new Properties();
            InputStream  arquivo = null;            
            arquivo = new FileInputStream("C:\\ambienteJava\\MobileBank\\src\\br\\unipe\\mobilebank\\config.properties");
            propriedades.load(arquivo);            
            this.url = propriedades.getProperty("host");
            this.usuario = propriedades.getProperty("user");
            this.senha = propriedades.getProperty("pswd");

            Class.forName("com.mysql.jdbc.Driver");

            conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);

        } catch (ClassNotFoundException | SQLException | FileNotFoundException ex) {
            Logger.getLogger(ConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ConexaoDAO getInstance() {
        if (ConexaoDAO.instance == null) {
            ConexaoDAO.instance = new ConexaoDAO();
        }
        return ConexaoDAO.instance;
    }

    public Connection getConexao() {
        return this.conexao;
    }

}
