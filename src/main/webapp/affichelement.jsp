
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "java.util.ArrayList"%>


  <div id="content" class="p-4 p-md-5 pt-5">
        <span style="text-align: left; display: inline;"><h2 style="color: #1C9FBC;">Gestion Element</h2></span>
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
                        <th>Nom d'Element</th>
                        <th>Module d'Element</th>
                        <th>Coefficient</th>
                        <th>Prof d'Element</th>
                        <th>Action</th>
                      </tr>
                    </thead>
                    <tbody>
                    <q:forEach items="${liste}" var="elem">
							<tr id="${elem.id}">
								<td>${elem.libele}</td>
								<td>${elem.mode.nom}</td>
								<td>${elem.coeff}</td>
								<td>${elem.prof.nom}</td>
								<td><a> <i class="fa fa-edit" style="font-size:20px;"></i>  </a> <button onclick="delete_ok(${elem.id})"> <i class="fa fa-trash" style="font-size:20px;"></i>  </button></td>
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
  <div class="title">Creer Element</div>
  <div class="content">
      <form action="" method="post">
          <div class="user-details">
              <div class="input-box">
                  <span class="details">Nom</span>
                  <input type="text" name="Nom_Element" placeholder="Enter Name" required>
              </div>
              <div class="input-box">
                  <span class="details">Module</span>
                  <input type="text" name="Module_Element" placeholder="Enter Module" required>
              </div>
              <div class="input-box">
                  <span class="details">Coefficient</span>
                  <input type="text" name="Coefficient_Element" placeholder="Enter Coefficient" required>
              </div>

              <div class="input-box">
                  <span class="details">Nom du Professeur</span>
                  <input type="text" name="Prof_Element" placeholder="Enter Professeur" required>
              </div>
              <div class="input-box">
                <span class="details">Filiere</span>
                <input type="text" name="filiere_Element" placeholder="Enter Professeur" required>
            </div>
            <div class="input-box">
              <span class="details">Semestre</span>
              <input type="text" name="semestre_Element" placeholder="Enter Professeur" required>
          </div>
          </div>

          <div class="button">
              <input type="submit" name="valider" class="btn btn-success" value="valider">
          </div>
      </form>
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