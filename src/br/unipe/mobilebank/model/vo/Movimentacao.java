/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.model.vo;

/**
 *
 * @author Rodolfo
 */
public class Movimentacao {
    
    private int movimentacaoPK;
    private int correntistaFK;
    private int contaFK;
    private int operacaoFK;

    public int getMovimentacaoPK() {
        return movimentacaoPK;
    }

    public void setMovimentacaoPK(int movimentacaoPK) {
        this.movimentacaoPK = movimentacaoPK;
    }

    public int getCorrentistaFK() {
        return correntistaFK;
    }

    public void setCorrentistaFK(int correntistaFK) {
        this.correntistaFK = correntistaFK;
    }

    public int getContaFK() {
        return contaFK;
    }

    public void setContaFK(int contaFK) {
        this.contaFK = contaFK;
    }

    public int getOperacaoFK() {
        return operacaoFK;
    }

    public void setOperacaoFK(int operacaoFK) {
        this.operacaoFK = operacaoFK;
    }
    
}
