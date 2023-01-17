package Controlleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEANS.Admin;
import BEANS.Compte;
import BEANS.Professuer;
import DAO.DaoAdmin;
import DAO.DaoProf;
import Metier.MetierAdmin;

/**
 * Servlet implementation class ajouter_admin
 */
@WebServlet("/ajouter_admin")
public class ajouter_admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       MetierAdmin admin = new MetierAdmin();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouter_admin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String email=request.getParameter("email");
	
		Compte c = new Compte(email,"admin");
		Admin a = new Admin(nom,prenom);
//		profs.ajouterProf(new Professuer("salma","rafik","bi"), new Compte("ss","23"));
		//int a = Integer.parseInt(request.getParameter("add_supp"));	
		admin.ajouterProf(a,c);
		DaoAdmin e=new DaoAdmin();
		Admin tmp=e.GetByName(nom, prenom) ;
		PrintWriter e1=response.getWriter();
		e1.print("<td>"+tmp.getNom()+"</td><td>"+tmp.getPrenom()+"</td><td> <a> <i class='fa fa-edit' style='font-size:20px;'></i>  </a> <button onclick='delete_admin("+tmp.getId()+")'> <i class='fa fa-trash' style='font-size:20px;'></i></button></td>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
