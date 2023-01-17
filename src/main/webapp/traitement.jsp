<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "java.util.ArrayList"%>


  
  
    <div id="content" class="p-4 p-md-5 pt-5">
        <span style="text-align: left; display: inline;"><h2 style="color: #1C9FBC;">Gestion Professeur</h2></span>
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
                        <th>Name</th>
                        <th>Pénom</th>
                        <th>Email</th>
                        <th>Spécialité</th>
                        <th>Action</th>
                      </tr>
                    </thead>
                    <tbody id="body">
						<q:forEach items="${liste}" var="elem">
							<tr id="${elem.code}">
								<td>${elem.nom}</td>
								<td>${elem.prenom}</td>
								<td>${elem.compte.login} </td>
								<td>${elem.specialite}</td>
								  <td><a> <i class="fa fa-edit" style="font-size:20px;"></i>  </a> <button onclick="delete_ok(${elem.code})"> <i class="fa fa-trash" style="font-size:20px;"></i>  </button></td>
							</tr>
						</q:forEach>
                    </tbody>
                  </table>
                  <button  type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop" style="text-align: right; background-color:#1C9FBC; display: inline;">
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
  <div class="title">Creer Compte Professeur</div>
  <div class="content">
          <div class="user-details">
<!--               <div class="input-box">
                  <span class="details">Code</span>
                  <input type="text" name="Code_prof" placeholder="Enter CODE" required>
              </div> -->
              <div class="input-box">
                  <span class="details">Name</span>
                  <input type="text" name="Name_prof" placeholder="Enter Name" id="nom_p" required>
              </div>
              <div class="input-box">
                  <span class="details">Last Name</span>
                  <input type="text" name="last_Name_prof" placeholder="Enter Lastname" id="prenom_p" required>
              </div>
              <div class="input-box">
                  <span class="details">Email</span>
                  <input type="email" name="email_prof" placeholder="Enter Email" id="email_p" required>
              </div>

              <div class="input-box">
                  <span class="details">Confirm Email</span>
                  <input type="text" name="email2_prof" placeholder="Confirm Email" required>
              </div>
              <div class="input-box">
                  <span class="details">Spécialité</span>
                  <input type="text" name="specialite_prof" placeholder="Enter Spécialité" id="specialite_p" required>
              </div>
          </div>

          <div class="button">
          <button value="valider"   onclick="add_ok()"         class="btn btn-success"> ok</button>
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
      
     
 