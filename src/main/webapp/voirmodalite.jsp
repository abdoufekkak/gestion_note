   <%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "java.util.ArrayList"%>
   <%@ page import= "BEANS.Element"%>
   
   
   <div id="content" class="p-4 p-md-5 pt-5">
        <span style="text-align: left; display: inline;"><h2 style="color: #1C9FBC;">Gestion D'Evaluation</h2></span>
        <div style="text-align: right;">
            <a href="login.html"><button type="button" class="btn btn-info">Log Out</button></a>
        </div>
        <div class="container">
            <div class="row">
              <div class="col-12">
                <div class="data_table">
                  <table id="example" class="table table-striped table-bordered">
                    <thead class="table-dark">
                      <tr style="background-color:#1C9FBC">
                        <th>Element</th>
                        <th>CC (%)</th>
                        <th>TP (%)</th>
                        <th>Projet (%)</th>
                        <th>Valider</th>
                      </tr>
                    </thead>
                    <tbody>
                    		<%ArrayList<Element> liste=(ArrayList<Element>) request.getAttribute("liste") ;	
                   int  k=0;
                   int  j=0;
                   int  l=0;

                    		if(liste.get(0).getModalte().size()==1){
                    			System.out.print(liste.get(0).getModalte().get(0).getLebele());
                    	   if(liste.get(0).getModalte().get(0).getLebele().equals("cc")){
                          k=1;
                    	   }
                    	   if(liste.get(0).getModalte().get(0).getLebele().equals("tp")){
                               j=1;
                         	   }
                    	   if(liste.get(0).getModalte().get(0).getLebele().equals("projet")){
                               l=1;
                         	   }
                       }
                    		if(liste.get(0).getModalte().size()==2){
                         	   if(liste.get(0).getModalte().get(0).getLebele().equals("cc") && liste.get(0).getModalte().get(1).getLebele().equals("tp")){
                               k=1;
                               j=1;
                         	   }
                         	   if(liste.get(0).getModalte().get(0).getLebele().equals("tp") && liste.get(0).getModalte().get(1).getLebele().equals("projet")){
                                    j=1;
                                    l=1;
                              	   }
                         	   if(liste.get(0).getModalte().get(1).getLebele().equals("projet") && liste.get(0).getModalte().get(0).getLebele().equals("cc")){
                                    k=1;
                                    l=1;
                              	   }
                      }
                    		
                    		
                  		%>
<% for(int i=0;i<liste.size();i++){
	%>

                            
							<tr id="">
							<td>	<%=liste.get(i).getLibele() %></td>

								<% if(k==1){ %>
								
								<td><input type="number" min="0" max="100" value="<%=liste.get(i).getModalte().get(0).getPortentage()%>" name="cc"></td>
								<%}else{%>
									<td><input type="number" min="0" max="100" value="0" name="cc"></td>

							<%} %>	
								<% if(j==1){ %>
								
								<td><input type="number" min="0" max="100" value="<%=liste.get(i).getModalte().get(1).getPortentage()%>" name="cc"></td>
								<%}else{%>
									<td><input type="number" min="0" max="100" value="0" name="cc"></td>

							<%} %>	
								
								<% if(l==1){ %>
								
								<td><input type="number" min="0" max="100" value="<%=liste.get(i).getModalte().get(2).getPortentage()%>" name="cc"></td>
								<%}else{%>
									<td><input type="number" min="0" max="100" value="0" name="cc"></td>

							<%} %>	
						
							</tr>
                   <%} %>
                    </tbody>
                  </table>
                  <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop" style="text-align: right; background-color:#1C9FBC; display: inline;">
                    Validero</button>
                </div>
              </div>
            </div>
          </div>
      </div>