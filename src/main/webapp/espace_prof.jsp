<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Bootstrap Table with Add and Delete Row Feature</title>
    <link rel="stylesheet" href="style.css">
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans"
    />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/icon?family=Material+Icons"
    />
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
    />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style type="text/css">
      #table {
        color: #404e67;
        background: #f5f7fa;
        font-family: "Open Sans", sans-serif;
      }
      .table-wrapper {
        width: 700px;
        margin: 30px auto;
        background: #fff;
        padding: 20px;
        box-shadow: 0 1px 1px rgba(0, 0, 0, 0.05);
      }
      .table-title {
        padding-bottom: 10px;
        margin: 0 0 10px;
      }
      .table-title h2 {
        margin: 6px 0 0;
        font-size: 22px;
      }
      .table-title .add-new {
        float: right;
        height: 30px;
        font-weight: bold;
        font-size: 12px;
        text-shadow: none;
        min-width: 100px;
        border-radius: 50px;
        line-height: 13px;
      }
      .table-title .add-new i {
        margin-right: 4px;
      }
      table.table {
        table-layout: fixed;
      }
      table.table tr th,
      table.table tr td {
        border-color: #e9e9e9;
      }
      table.table th i {
        font-size: 13px;
        margin: 0 5px;
        cursor: pointer;
      }
      table.table th:last-child {
        width: 100px;
      }
      table.table td a {
        cursor: pointer;
        display: inline-block;
        margin: 0 5px;
        min-width: 24px;
      }
      table.table td a.add {
        color: #27c46b;
      }
      table.table td a.edit {
        color: #ffc107;
      }
      table.table td a.delete {
        color: #e34724;
      }
      table.table td i {
        font-size: 19px;
      }
      table.table td a.add i {
        font-size: 24px;
        margin-right: -1px;
        position: relative;
        top: 3px;
      }
      table.table .form-control {
        height: 32px;
        line-height: 32px;
        box-shadow: none;
        border-radius: 2px;
      }
      table.table .form-control.error {
        border-color: #f50000;
      }
      table.table td .add {
        display: none;
      }
    </style>
    <script type="text/javascript">
      $(document).ready(function () {
        $('[data-toggle="tooltip"]').tooltip();
        var actions = $("table td:last-child").html();
        // Add row on add button click
        $(document).on("click", ".add", function () {
          var empty = false;
          var input = $(this).parents("tr").find('input[type="text"]');
          input.each(function () {
            if (!$(this).val()) {
              $(this).addClass("error");
              empty = true;
            } else {
              $(this).removeClass("error");
            }
          });
          $(this).parents("tr").find(".error").first().focus();
          if (!empty) {
            input.each(function () {
              $(this).parent("td").html($(this).val());
            });
            $(this).parents("tr").find(".add, .edit").toggle();
            $(".add-new").removeAttr("disabled");
          }
        });
        // Edit row on edit button click
        $(document).on("click", ".edit", function () {
          $(this)
            .parents("tr")
            .children('td:nth-child(4)')
            .each(function () {
              $(this).html(
                '<input type="text" class="form-control" value="' +
                  $(this).text() +
                  '">'
              );
            });
          $(this).parents("tr").find(".add, .edit").toggle();
          $(".add-new").attr("disabled", "disabled");
        });
        //valider
        $(document).on("click", ".check", function () {
            $(this)
            .parents("tr")
            .find("td:nth-child(5)")
            .each(function () {
              var i = 0;
              while(i<$("td:nth-child(4)").length){
                var validation =$("td:nth-child(4)")[i].innerHTML;
                console.log(validation);

                if(validation>=0 && validation<8){
                    $(this).html( '<label>Ajourné</label>');
                }
                else if (validation>=8 && validation<12){
                    $(this).html( '<label>Non Valider</label>');
                }
                else {
                    $(this).html( '<label>Valider</label>');
                }
                i=i+1;
              }
            });
        });
      });
    </script>
  </head>
  <body id="table">

    <!-- bar -->
<div class="container">
    <div class="side_menu">
      <div class="burger_box">
        <div class="menu-icon-container">
          <a href="#" class="menu-icon js-menu_toggle closed">
            <span class="menu-icon_box">
              <span class="menu-icon_line menu-icon_line--1"></span>
              <span class="menu-icon_line menu-icon_line--2"></span>
              <span class="menu-icon_line menu-icon_line--3"></span>
            </span>
          </a>
        </div>
      </div>
      <div class="px-5">
        <h2 class="menu_title">Elements :</h2>
        <ul class="list_load">
        	<q:forEach items="${liste}" var="elem">
						
          <li class="list_item" value="${elem.id}" ><a  onclick='affiche_etudiant("${elem.id}")'> ${elem.libele}</a></li>
          						</q:forEach>
          
       
        </ul>
        <div class="spacer_box"><p>Copyright 2022, FEKKAK Abdou, RAFIK Salma, HAFDI Mahfoud</p></div>
      </div>
    </div>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <script src="script.js"></script>
</div>
   <!-- fin bar --> 



    <div class="container">
      <div class="table-wrapper">
        <div class="table-title">
          <div class="row">
            <div class="col-sm-8">
              <h2>Liste Des<b> Etudiants</b></h2>
            </div>
            <div class="col-sm-4"></div>
          </div>
        </div>
        <table class="table table-bordered">
          <thead>
            <tr>
              <th>CNE</th>
              <th>Nom</th>
              <th>Prenom</th>
              <th>Note</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody id="body">
          
           
          </tbody>
        </table>
      </div>
    </div>
    <script >
    function affiche_etudiant(id){
    	 const xhttp = new XMLHttpRequest();
    	    
    	    xhttp.onload = function() {
    	    	console.log( this.responseText);
    	    	document.getElementById("body").innerHTML= this.responseText;
    	      
    	    }
    	    xhttp.open("GET", "afficheretud?id="+id);
    	    xhttp.send();
    	
    }</script>
  </body>
</html>

    