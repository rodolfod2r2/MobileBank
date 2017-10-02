/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.controller;

import br.unipe.mobilebank.model.dao.CorrentistaDAO;
import br.unipe.mobilebank.model.vo.Correntista;

/**
 *
 * @author rodolfo
 */
public class ControllerCorrentista {
    
    private CorrentistaDAO correntistaDao;
    
    public ControllerCorrentista(){        
        correntistaDao = new CorrentistaDAO();        
    }
    
    public void cadastroCorrentista (Correntista co){
        correntistaDao.salvarDados(co);
    }
    
    public void atualizaCorrentista (Correntista co){
        correntistaDao.atualizarDados(co);
    }
    
    public void deletaCorrentista (Correntista co){
        correntistaDao.deletarDados(co);
    }
    
    public void pesquisarCorrentista (Correntista co){
        correntistaDao.buscarDados(co);
    }
    
}
