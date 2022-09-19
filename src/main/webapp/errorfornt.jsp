<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add MOdule project</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="row">
          <div class="col md-6 offset-md-3">
               <form action="op.jsp">
               <div class="card">
                  <div class="card-header bg-dark text-white">
                  <h3>Provide me a two numbers</h3>
                  </div>
                  
                  <div class="card-body bg-secondary">
                  
                    <div class="form-group mb-3">
                    <input type="number" name="n1" class="form-control" placeholder="Enter n1">
                    </div>
                   
                    <div class="form-group mb-3">
                    <input type="number" name="n2" class="form-control" placeholder="Enter n2">
                     </div>
                     
                  </div>
                  
                   <div class="card-footer text-center bg-dark text-white">
                   
                   <button type="submit" class="btn btn-outline-light">Do Operation</button>
                   </div>
                   
               </div>
               </form>
               
          </div>
        
        </div>
    </div>
</body>
</html>