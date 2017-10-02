/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.controller;

import br.unipe.mobilebank.model.dao.ContaDAO;
import br.unipe.mobilebank.model.vo.Conta;

/**
 *
 * @author rodolfo
 */
public class ControllerConta {
    
    private ContaDAO contaDao;
    
    public ControllerConta(){        
        contaDao = new ContaDAO();        
    }
    
    public void cadastroConta (Conta conta){
        contaDao.salvarDados(conta);
    }
    
    public void atualizaConta (Conta conta){
        contaDao.atualizarDados(conta);
    }
    
    public void deletaConta (Conta conta){
        contaDao.deletarDados(conta);
    }
    
    public void pesquisarConta (Conta conta){
        contaDao.buscarDados(conta);
    }
    
}
