/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.controller;

import br.unipe.mobilebank.model.dao.OpBancariaDAO;
import br.unipe.mobilebank.model.vo.OpBancaria;

/**
 *
 * @author rodolfo
 */
public class ControllerOpBancaria {
    
    private OpBancariaDAO opBancariaDao;
    
    public ControllerOpBancaria(){        
        opBancariaDao = new OpBancariaDAO();        
    }
    
    public void cadastroOpBancaria (OpBancaria op){
        opBancariaDao.salvarDados(op);
    }
    
    public void atualizaOpBancaria (OpBancaria op){
        opBancariaDao.atualizarDados(op);
    }
    
    public void deletaOpBancaria (OpBancaria op){
        opBancariaDao.deletarDados(op);
    }
    
    public void pesquisarOpBancaria (OpBancaria op){
        opBancariaDao.buscarDados(op);
    }
    
}
