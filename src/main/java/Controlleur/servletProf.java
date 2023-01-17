package Controlleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEANS.Compte;
import BEANS.Professuer;
import Metier.MetierProf;

/**
 * Servlet implementation class servletProf
 */
@WebServlet("/servletProf")
public class servletProf extends HttpServlet {
	MetierProf profs = new MetierProf();
	private static final long serialVersionUID = 1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletProf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			ArrayList<Professuer> liste = new ArrayList<>();
			liste = profs.getAll();
			request.setAttribute("liste", liste);
			System.out.print(1);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("traitement.jsp");
		requestDispatcher.forward(request, response) ;
		
	
//			String nom=request.getParameter("nom");
//			String prenom=request.getParameter("prenom");
//			String specialite=request.getParameter("specialite");
//			String email=request.getParameter("email");
//			Compte c = new Compte(email,"admin");
//			Professuer p = new Professuer(nom,prenom,specialite);
////			profs.ajouterProf(new Professuer("salma","rafik","bi"), new Compte("ss","23"));
//			//int a = Integer.parseInt(request.getParameter("add_supp"));	
//			profs.ajouterProf(p,c);
//			System.out.println("abdou");
//		
//		System.out.println("slma");

	}
//		
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("Name_prof");
		String prenom=request.getParameter("last_Name_prof");
		String specialite=request.getParameter("specialite_prof");
		String email=request.getParameter("email_prof");
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
