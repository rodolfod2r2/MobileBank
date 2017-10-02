/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.model.bo;

import br.unipe.mobilebank.controller.ControllerMovimentacao;
import br.unipe.mobilebank.model.vo.Conta;
import br.unipe.mobilebank.model.vo.Movimentacao;

/**
 *
 * @author rodolfo
 */
public class MovimentacaoBO {
    
    ControllerMovimentacao controllerMovimentacaoDao;
    
    
    public void creditar (Conta conta){
        double Saldo = conta.getContaSaldo();
        conta.setContaAgengia(conta.getContaAgengia());
        conta.setContaNumero(conta.getContaNumero());
        Saldo = Saldo + conta.getContaSaldo();
        conta.setContaPK(conta.getContaPK());
        conta.setContaSaldo(Saldo);        
    }
    
    public void debitar (Conta conta){
        double Saldo = conta.getContaSaldo();
        conta.setContaAgengia(conta.getContaAgengia());
        conta.setContaNumero(conta.getContaNumero());
        Saldo = Saldo - conta.getContaSaldo();
        conta.setContaPK(conta.getContaPK());
        conta.setContaSaldo(Saldo);        
    }
    
}
