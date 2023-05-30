<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isErrorPage="true" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Page</title>
</head>
<body>
<div class = "container">
<div class = "col-md-6">
        <h1>Oops!</h1>
        <i class="fa-solid fa-triangle-exclamation"></i>
        <p class="flow-text" style="font-size:120%;">${error}</p>
        <a href="loginPage"><button class="btn  purple accent-4" id="refreshBtn">Go to HomePage</button></a>
    
    </div>
    </div>
    
</body>
</html>
    