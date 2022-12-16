package br.com.SistemaHotelaria.Aplicacao;

import br.com.SistemaHotelaria.Categoria.Categoria;
import br.com.SistemaHotelaria.Categoria.CategoriaDAO;
import br.com.SistemaHotelaria.Hotel.Hotel;
import br.com.SistemaHotelaria.Hotel.HotelDAO;
import br.com.SistemaHotelaria.Setor.Setor;
import br.com.SistemaHotelaria.Setor.SetorDAO;

import java.util.List;

public class ReadEmBanco {
    public static List<Hotel> readHotel() {
        HotelDAO hotelDAO = new HotelDAO();
        return hotelDAO.getHoteis();
    }

    public static List<Categoria> readCategoria() {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        return categoriaDAO.getCategorias();
    }

    public static List<Setor> readSetor() {
        SetorDAO setorDAO = new SetorDAO();
        return setorDAO.getSetores();
    }
}
