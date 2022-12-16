package br.com.SistemaHotelaria.Aplicacao;

import br.com.SistemaHotelaria.Categoria.CategoriaDAO;
import br.com.SistemaHotelaria.Hotel.HotelDAO;
import br.com.SistemaHotelaria.PossuiSetor.PossuiSetorDAO;
import br.com.SistemaHotelaria.Setor.SetorDAO;

public class RemoveEmBanco {
    public static void removeHotel(int codigo_hotel) {
        HotelDAO hotelDAO = new HotelDAO();
        hotelDAO.deleteHotelById(codigo_hotel);
    }

    public static void removeCategoria(int codigo_categoria) {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        categoriaDAO.deleteCategoriaByID(codigo_categoria);
    }

    public static void removeSetor(int codigo_setor) {
        SetorDAO setorDAO = new SetorDAO();
        setorDAO.deleteSetorById(codigo_setor);
    }

    public static void removePossuiSetor(int codigo_hotel, int codigo_setor) {
        PossuiSetorDAO psDao = new PossuiSetorDAO();
        psDao.deletePossuiSetorById(codigo_hotel, codigo_setor);
    }
}
