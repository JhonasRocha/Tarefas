package Service;

import java.util.ArrayList;

import Model.Pais;
import DAO.PaisDAO;

public class VendedorService {
	PaisDAO dao;
	
	public VendedorService(){
		dao = new PaisDAO();
	}
	public ArrayList<Pais> listarPais(){
		return dao.listarPais();
	}
	public ArrayList<Pais> listarPais(String chave){
		return dao.listarPais(chave);
	}

}
