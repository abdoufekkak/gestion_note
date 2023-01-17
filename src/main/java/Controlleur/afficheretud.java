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

import BEANS.Note;
import Metier.showElmentProf;

/**
 * Servlet implementation class afficheretud
 */
@WebServlet("/afficheretud")
public class afficheretud extends HttpServlet {
	private static final long serialVersionUID = 1L;
	showElmentProf x=new showElmentProf();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public afficheretud() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("id"));
		List<Note> y =  x.GETetudaint(a);
	request.setAttribute("y", y);
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("afficher_etudiant.jsp") ;
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
