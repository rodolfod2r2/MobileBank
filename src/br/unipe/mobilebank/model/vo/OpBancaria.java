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
public class OpBancaria {
    
    private int opBancPK;
    private String opBancNome;
    private String opBancDescricao;
    private String opBancDtCriada;
    private char opBancSituacao;
    private String opBancObservacao;

    public int getOpBancPK() {
        return opBancPK;
    }

    public void setOpBancPK(int opBancPK) {
        this.opBancPK = opBancPK;
    }

    public String getOpBancNome() {
        return opBancNome;
    }

    public void setOpBancNome(String opBancNome) {
        this.opBancNome = opBancNome;
    }

    public String getOpBancDescricao() {
        return opBancDescricao;
    }

    public void setOpBancDescricao(String opBancDescricao) {
        this.opBancDescricao = opBancDescricao;
    }

    public String getOpBancDtCriada() {
        return opBancDtCriada;
    }

    public void setOpBancDtCriada(String opBancDtCriada) {
        this.opBancDtCriada = opBancDtCriada;
    }

    public char getOpBancSituacao() {
        return opBancSituacao;
    }

    public void setOpBancSituacao(char opBancSituacao) {
        this.opBancSituacao = opBancSituacao;
    }

    public String getOpBancObservacao() {
        return opBancObservacao;
    }

    public void setOpBancObservacao(String opBancObservacao) {
        this.opBancObservacao = opBancObservacao;
    }

   
}
