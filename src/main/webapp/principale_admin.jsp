<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
 <head>

  	<title>Professeur</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet"/>
		
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
	<link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/style-form.css"/>
  </head>
  <body >
		<div class="wrapper d-flex align-items-stretch"   >
			<nav id="sidebar" class="active">
				<div class="custom-menu">
					<button type="button" id="sidebarCollapse" class="btn btn-primary">
	          <i class="fa fa-bars"></i>
	          <span class="sr-only">Toggle Menu</span>
	        </button>
        </div>
				<div class="p-4">
		  		<h1><a href="professeur.html" class="logo">MENU</a></h1>
	        <ul class="list-unstyled components mb-5">
	          <li>
	            <a><span class="fa fa-user mr-3"></span> <a onclick="ok()">Gestion Professeur</a> </a>
	          </li>
	          <li>
	              <a ><span class="fa fa-book mr-3"></span><a onclick="ok1()"> Gestion Filiere</a></a>
	          </li>
	          <li>
              <a href="module_element.html"><span class="fa fa-graduation-cap mr-3"></span><a onclick="ok4()"> Gestion Module & Element </a></a>
	          </li>
	          <li>
              <a href="module_element.html"><span class="fa fa-pencil mr-3"></span><a onclick="ok5()">Gestion Mod.Evaluation</a> </a>
	          </li>
	          <li>
              <a href="evaluation.html"><span class="fa fa-bars mr-3"></span> Affectation</a>
	          </li>
              <li>
              <a href="admin.html"><span class="fa fa-user-o mr-3"></span><a onclick="ok2()"> Compte Admin</a></a>
              </li>
              <li>
              <a href="login.html"><span class="fa fa-sign-out mr-3"></span> Log Out</a>
              </li>
	        </ul>


	        <div class="footer">
	        	<p>
				 Copyright 2022, FEKKAK Abdou, RAFIK Salma, HAFDI Mahfoud
                </p>
	        </div>

	      </div>
    	</nav>
  
<div id="ok" ></div>
  		</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/popper.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/bootstrap.bundle.min.js"></script>
    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="js/datatables.min.js"></script>
    <script src="js/pdfmake.min.js"></script>
    <script src="js/vfs_fonts.js"></script>
    <script src="js/custom.js"></script>
    
    
    <script>
    function delete_ok(id) {
        const xhttp = new XMLHttpRequest();
        
        xhttp.onload = function() {
            jQuery("#" + id).hide(1000);


        }
        xhttp.open("GET", "suppProf?Code_prof=" + id);
        xhttp.send();
        }

    function delete_filiere(id) {
        const xhttp = new XMLHttpRequest();
        
        xhttp.onload = function() {
            jQuery("#" + id).hide(1000);
 

        }
        xhttp.open("GET", "suppFiliere?Code_filiere=" + id);
        xhttp.send();
        }
    function delete_admin(id) {
        const xhttp = new XMLHttpRequest();
        
        xhttp.onload = function() {
            jQuery("#" + id).hide(1000);
 

        }
        xhttp.open("GET", "suppAdmin?Code_admin=" + id);
        xhttp.send();
        }

    </script>

    <script>
    function add_ok() {
        const xhttp = new XMLHttpRequest();
      
        xhttp.onload = function() {
        	var tr=document.createElement("tr");
        	tr.innerHTML=this.responseText;
        	console.log(this.responseText);
        	document.getElementById("body").append(tr);
        

        }   	
        var n = document.getElementById("nom_p");
       	var p = document.getElementById("prenom_p");
       	var e = document.getElementById("email_p");
       	var s = document.getElementById("specialite_p");

        xhttp.open("GET", "ajouterProf?nom=" +n.value+"&prenom="+p.value+"&email="+e.value+"&specialite="+s.value);
        xhttp.send();
        }
    function add_filiere() {
        const xhttp = new XMLHttpRequest();
      
        xhttp.onload = function() {
        	var tr=document.createElement("tr");
        	tr.innerHTML=this.responseText;
        	console.log(this.responseText);
        	document.getElementById("body").append(tr);
        

        }   	
        var n = document.getElementById("nom_f");
       	var c = document.getElementById("coo_f");
       	var ch = document.getElementById("chef_f");

        xhttp.open("GET", "ajouter_filiere?nom=" +n.value+"&coordinateur="+c.value+"&chef="+ch.value);
        xhttp.send();
        }
    function add_admin() {
        const xhttp = new XMLHttpRequest();
      
        xhttp.onload = function() {
        	var tr=document.createElement("tr");
        	tr.innerHTML=this.responseText;
        	console.log(this.responseText);
        	document.getElementById("body").append(tr);
        

        }   	
        var n = document.getElementById("Name_admin");
       	var p = document.getElementById("last_Name_admin");
       	var e = document.getElementById("email_admin");
        xhttp.open("GET", "ajouter_admin?nom=" +n.value+"&prenom="+p.value"&email="+e.value);
        xhttp.send();
        }
</script>
<script > 
function ok() {
    const xhttp = new XMLHttpRequest();
    
    xhttp.onload = function() {
    	document.getElementById("ok").innerHTML=this.responseText;
 
    }
    xhttp.open("GET", "servletProf");
    xhttp.send();
}
function ok1() {
    const xhttp = new XMLHttpRequest();
    
    xhttp.onload = function() {
    	document.getElementById("ok").innerHTML= this.responseText;
  
    }
    xhttp.open("GET", "gellAll_filiere");
    xhttp.send();
}
function ok2() {
    const xhttp = new XMLHttpRequest();
    
    xhttp.onload = function() {
    	document.getElementById("ok").innerHTML= this.responseText;
  
    }
    xhttp.open("GET", "servlet_admin");
    xhttp.send();
}

function ok1() {
    const xhttp = new XMLHttpRequest();
    
    xhttp.onload = function() {
    	document.getElementById("ok").innerHTML= this.responseText;
  
    }
    xhttp.open("GET", "gellAll_filiere");
    xhttp.send();
}
function ok4() {
    const xhttp = new XMLHttpRequest();
    
    xhttp.onload = function() {
    	document.getElementById("ok").innerHTML= this.responseText;
  
    }
    xhttp.open("GET", "getelement");
    xhttp.send();
}

function ok5() {
    const xhttp = new XMLHttpRequest();
    
    xhttp.onload = function() {
    	document.getElementById("ok").innerHTML= this.responseText;
  
    }
    xhttp.open("GET", "modcontrol");
    xhttp.send();
}

        </script>

  </body>
</html>