package br.com.SistemaHotelaria.Setor;

public class Setor {
    int codigo_setor;
    String descricao;
    String nome;
    String localizacao;
    String finalidade;
    String infraestrutura;
    int codigo_hotel;

    public int getCodigo_setor() {
        return codigo_setor;
    }

    public void setCodigo_setor(int codigo_setor) {
        this.codigo_setor = codigo_setor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public String getInfraestrutura() {
        return infraestrutura;
    }

    public void setInfraestrutura(String infraestrutura) {
        this.infraestrutura = infraestrutura;
    }

    public int getCodigo_hotel() {
        return codigo_hotel;
    }

    public void setCodigo_hotel(int codigo_hotel) {
        this.codigo_hotel = codigo_hotel;
    }
}
