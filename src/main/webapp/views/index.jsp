<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<meta charset="ISO-8859-1">
<title>CRUD Index page</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col  m6 offset-m3">
				<div class="card">
					<div class="card-content">
						<div class="form center-align">

							<table>
								<thead>
									<tr>
										<th>Select the page you want to Visit</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><a href="addNewUserPage">New User - Sign-up</a></td>
									</tr>
									<tr>
									<td><a href="loginPage">Existing User? - Sign-in</a></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>