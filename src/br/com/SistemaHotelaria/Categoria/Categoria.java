package br.com.SistemaHotelaria.Categoria;

public class Categoria {
    int codigo_categoria;
    int qntd_estrelas;
    String descricao;
    String nome;

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public int getQntd_estrelas() {
        return qntd_estrelas;
    }

    public void setQntd_estrelas(int qntd_estrelas) {
        this.qntd_estrelas = qntd_estrelas;
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
}
