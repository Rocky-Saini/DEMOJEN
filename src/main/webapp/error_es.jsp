<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sorry Something went wrong!!</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
</head>
<body>
     
     <div class="container p-3 text-center">
       <img alt="not" src="images/err3.jpg" class="img-fluid">
      
     <h1 class="display-3">Sorry ! something went wrong ..</h1>
        <p><%= exception %></p>
        <a href="errorfornt.jsp" class="btn btn-outline-primary" href>Home Page</a>
     </div>
     
</body>
</html>