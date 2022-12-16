package br.com.SistemaHotelaria.Aplicacao;

import br.com.SistemaHotelaria.Categoria.Categoria;
import br.com.SistemaHotelaria.Categoria.CategoriaDAO;
import br.com.SistemaHotelaria.Hotel.Hotel;
import br.com.SistemaHotelaria.Hotel.HotelDAO;
import br.com.SistemaHotelaria.PossuiSetor.PossuiSetor;
import br.com.SistemaHotelaria.PossuiSetor.PossuiSetorDAO;
import br.com.SistemaHotelaria.Setor.Setor;
import br.com.SistemaHotelaria.Setor.SetorDAO;

public class InsereEmBanco {

    public static void insereHotel(String CNPJ,
                                   String CNAES,
                                   String razao_social,
                                   float faturamento_anual,
                                   String data_abertura,
                                   String end_CEP,
                                   String end_bairro,
                                   String end_estado,
                                   String end_cidade,
                                   String end_logradouro,
                                   int end_numero,
                                   String tamanho,
                                   String nome_fantasia,
                                   int codigo_categoria,
                                   int codigo_setor) {
        Hotel hotel = new Hotel();
        hotel.setCNPJ(CNPJ);
        hotel.setCNAES(CNAES);
        hotel.setRazao_social(razao_social);
        hotel.setFaturamento_anual(faturamento_anual);
        hotel.setData_abertura(data_abertura);
        hotel.setEnd_CEP(end_CEP);
        hotel.setEnd_bairro(end_bairro);
        hotel.setEnd_estado(end_estado);
        hotel.setEnd_cidade(end_cidade);
        hotel.setEnd_logradouro(end_logradouro);
        hotel.setEnd_numero(end_numero);
        hotel.setTamanho(tamanho);
        hotel.setNome_fantasia(nome_fantasia);
        hotel.setCodigo_categoria(codigo_categoria);
        hotel.setCodigo_setor(codigo_setor);

        HotelDAO hotelDAO = new HotelDAO();

        hotelDAO.save(hotel);
    }

    public static void insereCategoria(int qntd_estrelas,
                                       String descricao,
                                       String nome) {
        Categoria cat = new Categoria();
        CategoriaDAO catDao = new CategoriaDAO();

        cat.setQntd_estrelas(qntd_estrelas);
        cat.setDescricao(descricao);
        cat.setNome(nome);

        catDao.save(cat);
    }

    public static void insereSetor(
            String descricao,
            String nome,
            String localizacao,
            String finalidade,
            String infraestrutura,
            int codigo_hotel
    ) {
        Setor setor = new Setor();
        SetorDAO setorDAO = new SetorDAO();

        setor.setDescricao(descricao);
        setor.setNome(nome);
        setor.setLocalizacao(localizacao);
        setor.setFinalidade(finalidade);
        setor.setInfraestrutura(infraestrutura);
        setor.setCodigo_hotel(codigo_hotel);

        setorDAO.save(setor);
    }


    public static void inserePossuiSetor(int codigo_hotel, int codigo_setor) {
        PossuiSetor possuiSetor = new PossuiSetor();
        PossuiSetorDAO possuiSetorDAO = new PossuiSetorDAO();

        possuiSetor.setCodigo_setor(codigo_setor);
        possuiSetor.setCodigo_hotel(codigo_hotel);

        possuiSetorDAO.save(possuiSetor);
    }


}
