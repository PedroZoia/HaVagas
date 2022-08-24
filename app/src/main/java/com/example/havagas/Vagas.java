package com.example.havagas;

public class Vagas {
    private String nomeCompleto;
    private String email;
    private boolean receberEmail;
    private String telefone;
    private String tipoTel;
    private boolean possuiCel;
    private String cel;
    private String sexo;
    private String date;
    private String formacao;
    private String anoFormacao;
    private String anoConclusao;
    private String instituicao;


    private String titulo;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isReceberEmail() {
        return receberEmail;
    }

    public void setReceberEmail(boolean receberEmail) {
        this.receberEmail = receberEmail;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoTel() {
        return tipoTel;
    }

    public void setTipoTel(String tipoTel) {
        this.tipoTel = tipoTel;
    }

    public boolean isPossuiCel() {
        return possuiCel;
    }

    public void setPossuiCel(boolean possuiCel) {
        this.possuiCel = possuiCel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAnoFormacao() {
        return anoFormacao;
    }

    public void setAnoFormacao(String anoFormacao) {
        this.anoFormacao = anoFormacao;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrienteador() {
        return orienteador;
    }

    public void setOrienteador(String orienteador) {
        this.orienteador = orienteador;
    }

    public String getVagasInteresse() {
        return vagasInteresse;
    }

    public void setVagasInteresse(String vagasInteresse) {
        this.vagasInteresse = vagasInteresse;
    }

    private String orienteador;

    public Vagas(String nomeCompleto, String email, boolean receberEmail, String telefone, String tipoTel, boolean possuiCel, String cel, String sexo, String date, String formacao, String anoFormacao, String anoConclusao, String instituicao, String titulo, String orienteador, String vagasInteresse) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.receberEmail = receberEmail;
        this.telefone = telefone;
        this.tipoTel = tipoTel;
        this.possuiCel = possuiCel;
        this.cel = cel;
        this.sexo = sexo;
        this.date = date;
        this.formacao = formacao;
        this.anoFormacao = anoFormacao;
        this.anoConclusao = anoConclusao;
        this.instituicao = instituicao;
        this.titulo = titulo;
        this.orienteador = orienteador;
        this.vagasInteresse = vagasInteresse;
    }

    private String vagasInteresse;

    @Override
    public String toString() {
        return "Vagas{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", receberEmail=" + receberEmail +
                ", telefone='" + telefone + '\'' +
                ", tipoTel='" + tipoTel + '\'' +
                ", possuiCel=" + possuiCel +
                ", cel='" + cel + '\'' +
                ", sexo='" + sexo + '\'' +
                ", date='" + date + '\'' +
                ", formacao='" + formacao + '\'' +
                ", anoFormacao='" + anoFormacao + '\'' +
                ", anoConclusao='" + anoConclusao + '\'' +
                ", instituicao='" + instituicao + '\'' +
                ", titulo='" + titulo + '\'' +
                ", orienteador='" + orienteador + '\'' +
                ", vagasInteresse='" + vagasInteresse + '\'' +
                '}';
    }
}
