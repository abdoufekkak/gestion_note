<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "java.util.ArrayList"%>


  
  
     <div id="content" class="p-4 p-md-5 pt-5">
        <span style="text-align: left; display: inline">
          <a href="#"><h2 style="color: #1c9fbc">Gestion Filiere</h2></a>
        </span>
        <div style="text-align: right">
          <a href="login.html">
            <button type="button" class="btn btn-info">log out</button>
          </a>
        </div>

        <div class="container">
          <div class="row">
            <div class="col-12">
              <div class="data_table">
                <table id="example" class="table table-striped table-bordered">
                  <thead class="table-dark">
                    <tr style="background-color: #1c9fbc">
                      <th>Nom filiere</th>
                      <th>Cordinateur de Filiere</th>
                      <th>Chef Departement</th>
                      <th>Action</th>
                    </tr>
                  </thead>
                  <tbody id="body">
                 <q:forEach items="${liste}" var="elem">
							<tr id="${elem.code_fil}">
									<td>${elem.nom_fil}</td>
							
								<td>${elem.coordinateur_fil}</td>
								<td>${elem.chef_fil}</td>
								  <td><a> <i class="fa fa-edit" style="font-size:20px;"></i>  </a> <button onclick="delete_filiere(${elem.code_fil})"> <i class="fa fa-trash" style="font-size:20px;"></i>  </button></td>
							</tr>
						</q:forEach>
                  </tbody>
                </table>
                <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop" style="text-align: right; background-color:#1C9FBC; display: inline;">
                  Ajouter</button>

                  <!-- POMPT  ajouter -->
                  <div
class="modal fade"
id="staticBackdrop"
data-bs-backdrop="static"
data-bs-keyboard="false"
tabindex="-1"
aria-labelledby="staticBackdropLabel"
aria-hidden="true"
>
<div class="modal-dialog modal-dialog-scrollable">
  <div class="modal-content">
    <div class="modal-header">
      <button
        type="button"
        class="btn-close"
        data-bs-dismiss="modal"
        aria-label="Close"
      ></button>
    </div>
    <div class="modal-body">
<!--form-->
<div class="containerr container">
<div class="title">Creer une Filiere</div>
<div class="content">
        <div class="user-details">
            <div class="input-box">
                <span class="details">Nom</span>
                <input type="text" id='nom_f' name="Name_filiere" placeholder="Enter CIN" required>
            </div>
            <div class="input-box">
                <span class="details">Coordinateur</span>
                <input type="text" id='coo_f'  name="coordinateur_filiere" placeholder="Enter le Coordinateur" required>
            </div>
            <div class="input-box">
                <span class="details">Chef de Département</span>
                <input type="text" id='chef_f'  name="chef_filiere" placeholder="Enter Chef de Département" required>
            </div>
            <div class="input-box">
              <span class="details">Chef de Département</span>
              <input type="text" name="chef_filiere" placeholder="Enter Chef de Département" required>
          </div>
        <div class="button">
            <input onclick="add_filiere()" type="submit" name="valider" class="btn btn-success" value="valider">
        </div>
</div>
</div>
    </div>
    <div class="modal-footer">
      <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">
        Close
      </button>
    </div>
  </div>
</div>
</div>
              </div>
            </div>
          </div>
        </div>
      </div>
      
     
 