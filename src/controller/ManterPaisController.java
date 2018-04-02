package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Pais;
import Service.PaisService;

/**
 * Servlet implementation class ManterPaisController
 */
@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	String pNome = request.getParameter("nome");
	long pPopulacao = Long.parseLong (request.getParameter("Populacao"));
	double pArea = Double.parseDouble (request.getParameter("area"));
	
	//instanciar o javabean
	Pais pais = new Pais();
	pais.setNome(pNome);
	pais.setPopulacao(pPopulacao);
	pais.setArea(pArea);
	
	//instanciar o service
	PaisService cs = new PaisService();
	PaisService.criar(pais);
	pais = cs.carregar(pais.getId());
	
	//enviar para o jsp
	request.setAttribute("pais", pais);
	RequestDispatcher view =
	request.getRequestDispatcher("Pais.jsp");
	view.forward(request, response);
	}
	

}