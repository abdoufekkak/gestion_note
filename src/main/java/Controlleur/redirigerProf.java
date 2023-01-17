package Controlleur;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEANS.Compte;
import BEANS.Element;
import BEANS.Filiere;
import Metier.MetierElement;
import Metier.showElmentProf;

/**
 * Servlet implementation class redirigerProf
 */
@WebServlet("/redirigerProf")
public class redirigerProf extends HttpServlet {
	private static final long serialVersionUID = 1L;
	showElmentProf ff=new showElmentProf();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public redirigerProf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Element> liste = new ArrayList<Element>();
		String login=request.getParameter("login");
		String mdp=request.getParameter("motdepass");
		liste =ff.GETElementPROF(new Compte(login,mdp));
		request.setAttribute("liste", liste);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("espace_prof.jsp") ;
		requestDispatcher.forward(request, response) ;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
