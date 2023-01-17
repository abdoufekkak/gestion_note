  <%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "java.util.List"%>
   <%@ page import= "BEANS.Element"%>
      <%@ page import= "BEANS.Note"%>
   
   
   
   
   
   <% 
   List<Note> y =(List<Note>) request.getAttribute("y");
    %>
   
   <% for(int i =0;i<y.size();i++){%>
   <tr>
	   <td><%=y.get(i).getEtudiant().getCne()%> </td>
              <td><%=y.get(i).getEtudiant().getNom()%></td>
              <td><%=y.get(i).getEtudiant().getPrenom()%></td>
              <td><%=y.get(i).getValue()%></td>
           
	   


              <td>
                <a class="add" title="Add" data-toggle="tooltip"
                  ><i class="material-icons">&#xE03B;</i></a
                >
                <a class="edit" title="Edit" data-toggle="tooltip"
                  ><i class="material-icons">&#xE254;</i></a
                >
                <a class="check" title="check" data-toggle="tooltip"
                  ><i class="material-icons">&#xe86c;</i></a
                >
              </td>
                 </tr>
     <% }%>