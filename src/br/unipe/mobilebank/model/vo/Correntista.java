package br.unipe.mobilebank.model.vo;

/**
 *
 * @author Rodolfo
 */
public class Correntista {
    
    private int correntistaPK;
    private String correntistaNome;
    private String correntistaRG;
    private String correntistaCPF;
    private String correntistaEstCivil;
    private String correntistaSexo;
    private char correntistaSituacao;
    private String correntistaDtNasc;
    private String correntistaDtCadBanco;
    private String correntistaProfissao;
    private String correntistaEmail;
    private String correntistaTelefone;
    private Endereco correntistaEndereco;
    private String correntistaObservacao;

    public int getCorrentistaPK() {
        return correntistaPK;
    }

    public void setCorrentistaPK(int correntistaPK) {
        this.correntistaPK = correntistaPK;
    }

    public String getCorrentistaNome() {
        return correntistaNome;
    }

    public void setCorrentistaNome(String correntistaNome) {
        this.correntistaNome = correntistaNome;
    }

    public String getCorrentistaRG() {
        return correntistaRG;
    }

    public void setCorrentistaRG(String correntistaRG) {
        this.correntistaRG = correntistaRG;
    }

    public String getCorrentistaCPF() {
        return correntistaCPF;
    }

    public void setCorrentistaCPF(String correntistaCPF) {
        this.correntistaCPF = correntistaCPF;
    }

    public String getCorrentistaEstCivil() {
        return correntistaEstCivil;
    }

    public void setCorrentistaEstCivil(String correntistaEstCivil) {
        this.correntistaEstCivil = correntistaEstCivil;
    }

    public String getCorrentistaSexo() {
        return correntistaSexo;
    }

    public void setCorrentistaSexo(String correntistaSexo) {
        this.correntistaSexo = correntistaSexo;
    }

    public char getCorrentistaSituacao() {
        return correntistaSituacao;
    }

    public void setCorrentistaSituacao(char correntistaSituacao) {
        this.correntistaSituacao = correntistaSituacao;
    }

    public String getCorrentistaDtNasc() {
        return correntistaDtNasc;
    }

    public void setCorrentistaDtNasc(String correntistaDtNasc) {
        this.correntistaDtNasc = correntistaDtNasc;
    }

    public String getCorrentistaDtCadBanco() {
        return correntistaDtCadBanco;
    }

    public void setCorrentistaDtCadBanco(String correntistaDtCadBanco) {
        this.correntistaDtCadBanco = correntistaDtCadBanco;
    }

    public String getCorrentistaProfissao() {
        return correntistaProfissao;
    }

    public void setCorrentistaProfissao(String correntistaProfissao) {
        this.correntistaProfissao = correntistaProfissao;
    }

    public String getCorrentistaEmail() {
        return correntistaEmail;
    }

    public void setCorrentistaEmail(String correntistaEmail) {
        this.correntistaEmail = correntistaEmail;
    }

    public String getCorrentistaTelefone() {
        return correntistaTelefone;
    }

    public void setCorrentistaTelefone(String correntistaTelefone) {
        this.correntistaTelefone = correntistaTelefone;
    }

    public Endereco getCorrentistaEndereco() {
        return correntistaEndereco;
    }

    public void setCorrentistaEndereco(Endereco correntistaEndereco) {
        this.correntistaEndereco = correntistaEndereco;
    }

    public String getCorrentistaObservacao() {
        return correntistaObservacao;
    }

    public void setCorrentistaObservacao(String correntistaObservacao) {
        this.correntistaObservacao = correntistaObservacao;
    }

    
}
