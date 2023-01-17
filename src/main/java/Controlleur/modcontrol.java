package Controlleur;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEANS.Element;
import BEANS.Modalite;
import Metier.MetieModalite;
import Metier.MetierElement;

/**
 * Servlet implementation class modcontrol
 */
@WebServlet("/modcontrol")
public class modcontrol extends HttpServlet {
	MetierElement	 ff=new MetierElement();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modcontrol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Element> liste = new ArrayList<Element>();
		liste=ff.getAll();
		request.setAttribute("liste", liste);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("voirmodalite.jsp") ;
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
