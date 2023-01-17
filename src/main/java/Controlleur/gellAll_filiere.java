package Controlleur;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEANS.Filiere;
import BEANS.Professuer;
import Metier.MetierFiliere;

/**
 * Servlet implementation class gellAll_filiere
 */
@WebServlet("/gellAll_filiere")
public class gellAll_filiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
MetierFiliere	fil =new MetierFiliere();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gellAll_filiere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Filiere> liste = new ArrayList<Filiere>();
		liste = fil.getAll();
		request.setAttribute("liste", liste);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("traitement_filiere.jsp") ;
		requestDispatcher.forward(request, response) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
