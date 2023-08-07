<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<title>CRUD Login page</title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<body>
	<div class="container">
		<div class="row">
			<div class="col  m6 offset-m3">
				<div class="card">
					<div class="card-content">
						<div class="form center-align">
						
							<form method="post" action="login" id="loginForm">
								<table>
									<tr>
										<td>UserName:</td>
										<td><input type="text" name="UserName"></td>
									</tr>

									<tr>
										<td>Password:</td>
										<td><input type="password" name="password"></td>
									</tr>
									<tr>
										<td></td>
										<td><button type="submit" class="btn  purple accent-4" >Submit</button></td>
									</tr>
								</table>
								<input type="hidden" name="crudCall" value="login">
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>