package Controlleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class Servlet_Professeur
 */
@WebServlet("/Servlet_Professeur")
public class Servlet_Professeur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MetierProf profs = new MetierProf();
    public Servlet_Professeur() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("add_supp"));
		if (a==0) {
			int id = Integer.parseInt(request.getParameter("Code_prof"));
			profs.deleteProf(id);
		}
		else if (a==1){
			ArrayList<Professuer> liste = new ArrayList<>();
			liste = profs.getAll();
			request.setAttribute("liste", liste);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("professeur.jsp") ;
			requestDispatcher.forward(request, response) ;
		}
		else if (a==2) {
			int id = Integer.parseInt(request.getParameter("Code_prof"));
			String nom=request.getParameter("Name_prof");
			String prenom=request.getParameter("last_Name_prof");
			String specialite=request.getParameter("specialite_prof");
			String email=request.getParameter("email_prof");
			String email2=request.getParameter("email2_prof");
			Professuer p = new Professuer(nom,prenom,specialite);
			
			profs.Updateprof(id, p);
		}
//		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("Name_prof");
		String prenom=request.getParameter("last_Name_prof");
		String specialite=request.getParameter("specialite_prof");
		String email=request.getParameter("email_prof");
		String email2=request.getParameter("email2_prof");
		Compte c = new Compte(email,"admin");
		Professuer p = new Professuer(nom,prenom,specialite);
		//int a = Integer.parseInt(request.getParameter("add_supp"));	
		
		
		profs.ajouterProf(p,c);
//		if (a==2) {
//			int id = Integer.parseInt(request.getParameter("Code_prof"));			
//			profs.Updateprof(id, p);
//		}
//		
//		else {
			ArrayList<Professuer> liste = new ArrayList<>();
			liste = profs.getAll();
			request.setAttribute("liste", liste);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("professeur.jsp") ;
			requestDispatcher.forward(request, response) ;

//		}
//	}
	}
}
