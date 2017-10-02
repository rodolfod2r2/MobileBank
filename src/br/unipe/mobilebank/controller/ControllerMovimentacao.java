/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.controller;

import br.unipe.mobilebank.model.dao.MovimentacaoDAO;
import br.unipe.mobilebank.model.vo.Movimentacao;

/**
 *
 * @author rodolfo
 */
public class ControllerMovimentacao {
    
    private MovimentacaoDAO movimentacaoDao;
    
    public ControllerMovimentacao(){        
        movimentacaoDao = new MovimentacaoDAO();        
    }
    
    public void cadastroMovimentacao (Movimentacao mo){
        movimentacaoDao.salvarDados(mo);
    }
    
    public void atualizaMovimentacao (Movimentacao mo){
        movimentacaoDao.atualizarDados(mo);
    }
    
    public void deletaMovimentacao (Movimentacao mo){
        movimentacaoDao.deletarDados(mo);
    }
    
    public void pesquisarMovimentacao (Movimentacao mo){
        movimentacaoDao.buscarDados(mo);
    }
}
