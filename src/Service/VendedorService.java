package Service;

import java.io.IOException;
import java.util.ArrayList;

import Model.Pais;
import DAO.PaisDAO;

public class VendedorService {
	PaisDAO dao;
	
	public VendedorService(){
		dao = new PaisDAO();
	}
	public ArrayList<Pais> listarPais() throws IOException {
		return dao.listarPais();
	}
	public ArrayList<Pais> listarPais(String chave) throws IOException {
		return dao.listarPais(chave);
	}

}
