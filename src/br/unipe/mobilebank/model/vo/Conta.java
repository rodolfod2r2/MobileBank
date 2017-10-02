package br.unipe.mobilebank.model.vo;

/**
 *
 * @author Rodolfo
 */
public class Conta {

    private int contaPK;
    private String contaNumero;
    private double contaSaldo;
    private String contaDtCriacao;
    private char contaSituacao;
    private String contaTipo;
    private String contaAgengia;
    private Endereco contaEndereco;
    private String contaObservacao;

    public int getContaPK() {
        return contaPK;
    }

    public void setContaPK(int contaPK) {
        this.contaPK = contaPK;
    }

    public String getContaNumero() {
        return contaNumero;
    }

    public void setContaNumero(String contaNumero) {
        this.contaNumero = contaNumero;
    }

    public double getContaSaldo() {
        return contaSaldo;
    }

    public void setContaSaldo(double contaSaldo) {
        this.contaSaldo = contaSaldo;
    }

    public String getContaDtCriacao() {
        return contaDtCriacao;
    }

    public void setContaDtCriacao(String contaDtCriacao) {
        this.contaDtCriacao = contaDtCriacao;
    }

    public char getContaSituacao() {
        return contaSituacao;
    }

    public void setContaSituacao(char contaSituacao) {
        this.contaSituacao = contaSituacao;
    }

    public String getContaTipo() {
        return contaTipo;
    }

    public void setContaTipo(String contaTipo) {
        this.contaTipo = contaTipo;
    }

    public String getContaAgengia() {
        return contaAgengia;
    }

    public void setContaAgengia(String contaAgengia) {
        this.contaAgengia = contaAgengia;
    }

    public Endereco getContaEndereco() {
        return contaEndereco;
    }

    public void setContaEndereco(Endereco contaEndereco) {
        this.contaEndereco = contaEndereco;
    }

    public String getContaObservacao() {
        return contaObservacao;
    }

    public void setContaObservacao(String contaObservacao) {
        this.contaObservacao = contaObservacao;
    }

}
