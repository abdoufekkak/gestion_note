package Controlleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEANS.Compte;
import BEANS.Filiere;
import BEANS.Professuer;
import DAO.DaoFiliere;
import DAO.DaoProf;
import Metier.MetierFiliere;

/**
 * Servlet implementation class ajouter_filiere
 */
@WebServlet("/ajouter_filiere")
public class ajouter_filiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MetierFiliere filiere = new MetierFiliere();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouter_filiere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String nom=request.getParameter("nom");
		String coordinateur=request.getParameter("coordinateur");
		String chef=request.getParameter("chef");
		Filiere f = new Filiere(nom, coordinateur, chef);
//		profs.ajouterProf(new Professuer("salma","rafik","bi"), new Compte("ss","23"));
		//int a = Integer.parseInt(request.getParameter("add_supp"));	
		filiere.ajouterProf(f);
		DaoFiliere e=new DaoFiliere();
		Filiere tmp=e.GetByName(nom) ; 
		PrintWriter e1=response.getWriter();
		e1.print("<td>"+tmp.getNom()+"</td><td>"+tmp.getCoordinateur_fil()+"</td><td>"+tmp.getChef_fil()+"</td><td> <a> <i class='fa fa-edit' style='font-size:20px;'></i>  </a> <button onclick='delete_filiere("+tmp.getcode_fil()+")'> <i class='fa fa-trash' style='font-size:20px;'></i></button></td>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
