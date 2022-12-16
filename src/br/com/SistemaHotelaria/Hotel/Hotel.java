package br.com.SistemaHotelaria.Hotel;

import java.sql.Date;

public class Hotel {
    private int codigo_hotel;
    private String CNPJ;
    private String CNAES;
    private String razao_social;
    private float faturamento_anual;
    private Date data_abertura;
    private String end_CEP;
    private String end_bairro;
    private String end_estado;
    private String end_cidade;
    private String end_logradouro;
    private int end_numero;
    private String tamanho;
    private String nome_fantasia;
    private int codigo_categoria;
    private int codigo_setor;

    public void setData_abertura(Date data_abertura) {
        this.data_abertura = data_abertura;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }


    public int getCodigo_hotel() {
        return codigo_hotel;
    }

    public void setCodigo_hotel(int codigo_hotel) {
        this.codigo_hotel = codigo_hotel;
    }
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNAES() {
        return CNAES;
    }

    public void setCNAES(String CNAES) {
        this.CNAES = CNAES;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public float getFaturamento_anual() {
        return faturamento_anual;
    }

    public void setFaturamento_anual(float faturamento_anual) {
        this.faturamento_anual = faturamento_anual;
    }

    public Date getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(String data_abertura) {
        this.data_abertura = Date.valueOf(data_abertura);
    }

    public String getEnd_CEP() {
        return end_CEP;
    }

    public void setEnd_CEP(String end_CEP) {
        this.end_CEP = end_CEP;
    }

    public String getEnd_bairro() {
        return end_bairro;
    }

    public void setEnd_bairro(String end_bairro) {
        this.end_bairro = end_bairro;
    }

    public String getEnd_estado() {
        return end_estado;
    }

    public void setEnd_estado(String end_estado) {
        this.end_estado = end_estado;
    }

    public String getEnd_cidade() {
        return end_cidade;
    }

    public void setEnd_cidade(String end_cidade) {
        this.end_cidade = end_cidade;
    }

    public String getEnd_logradouro() {
        return end_logradouro;
    }

    public void setEnd_logradouro(String end_logradouro) {
        this.end_logradouro = end_logradouro;
    }

    public int getEnd_numero() {
        return end_numero;
    }

    public void setEnd_numero(int end_numero) {
        this.end_numero = end_numero;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public int getCodigo_setor() {
        return codigo_setor;
    }

    public void setCodigo_setor(int codigo_setor) {
        this.codigo_setor = codigo_setor;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "codigo_hotel=" + codigo_hotel +
                ", CNPJ='" + CNPJ + '\'' +
                ", CNAES='" + CNAES + '\'' +
                ", razao_social='" + razao_social + '\'' +
                ", faturamento_anual=" + faturamento_anual +
                ", data_abertura=" + data_abertura +
                ", end_CEP='" + end_CEP + '\'' +
                ", end_bairro='" + end_bairro + '\'' +
                ", end_estado='" + end_estado + '\'' +
                ", end_cidade='" + end_cidade + '\'' +
                ", end_logradouro='" + end_logradouro + '\'' +
                ", end_numero=" + end_numero +
                ", tamanho='" + tamanho + '\'' +
                ", nome_fantasia='" + nome_fantasia + '\'' +
                '}';
    }
}
