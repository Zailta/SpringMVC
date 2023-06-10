<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
	<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<head>
<meta charset="ISO-8859-1">
<title>CRUD Search page</title>
</head>
<body>
<div class = "container">
<div class = "col-md-12">
<h4 class = "text-center md-3">We welcome you to the CRUD APP, ${UserName}! </h4>
<br>

<div class="search-container">
  <form action="/search" method="POST">
    <input class="search expandright" id="searchright" type="search" name="searchright" placeholder="Search">
    <button type="submit" class="btn  purple accent-4" >Search</button>
  </form>
</div>

	<table class="striped">
        <thead>
          <tr>
              <th>UserName</th>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Email</th>
              <th>Action</th>
          </tr>
        </thead>

        <tbody>
        <c:forEach items="${userEntity}"  var="ue">
          <tr>
            <td>${ue.getUserName()}</td>
            <td>${ue.getFirstName()}</td>
            <td>${ue.getLastName()}</td>
            <td>${ue.getEmail()}</td>
            <td> <a href="delete/${ue.getUserName()}"><i class="fa-solid fa-trash"></i></a></td>
            <td> <a href="updatePage/${ue.getUserName()}"><i class="fa-solid fa-pen-to-square"></i></a></td>
          </tr>

          </c:forEach>
        </tbody>
      </table>
      </div>
      </div>
</body>
</html>