package Controlleur;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEANS.Admin;
import BEANS.Filiere;
import Metier.MetierAdmin;

/**
 * Servlet implementation class servlet_admin
 */
@WebServlet("/servlet_admin")
public class servlet_admin extends HttpServlet {
	 MetierAdmin ff=new MetierAdmin();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_admin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Admin> liste = new ArrayList<Admin>();
		liste = ff.getAll();
		request.setAttribute("liste", liste);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("afficheradmin.jsp") ;
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
