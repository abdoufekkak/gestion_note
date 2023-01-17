package Controlleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEANS.Compte;
import BEANS.Professuer;
import DAO.DaoProf;
import Metier.MetierProf;

/**
 * Servlet implementation class ajouterProf
 */
@WebServlet("/ajouterProf")
public class ajouterProf extends HttpServlet {
	MetierProf	profs=new MetierProf();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouterProf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String specialite=request.getParameter("specialite");
		String email=request.getParameter("email");
		System.out.print(email);
		System.out.print("nom");
		Compte c = new Compte(email,"admin");
		Professuer p = new Professuer(nom,prenom,specialite);
//		profs.ajouterProf(new Professuer("salma","rafik","bi"), new Compte("ss","23"));
		//int a = Integer.parseInt(request.getParameter("add_supp"));	
		profs.ajouterProf(p,c);
		DaoProf e=new DaoProf();
		Professuer tmp=e.GetByName(nom, prenom) ; 
		PrintWriter e1=response.getWriter();
		e1.print("<td>"+tmp.getNom()+"</td><td>"+tmp.getPrenom()+"</td><td>"+tmp.getCompte().getLogin()+"</td><td>"+tmp.getSpecialite()+"</td><td> <a> <i class='fa fa-edit' style='font-size:20px;'></i>  </a> <button onclick='delete_ok("+tmp.getCode()+")'> <i class='fa fa-trash' style='font-size:20px;'></i></button></td>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
