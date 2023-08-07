<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

<head>
<meta charset="ISO-8859-1">
<title>CRUD New User page</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col  m6 offset-m3">
				<div class="card">
					<div class="card-content">
						<div class="form center-align">
							<form action="/save" method="POST" id="addnewuserForm" enctype="multipart/form-data">
								<table>
									<tr>
										<td>UserName:</td>
										<td><input type="text" name="userName"></td>
									</tr>

									<tr>
										<td>First Name:</td>
										<td><input type="text" name="firstName"></td>
									</tr>

									<tr>
										<td>Last Name:</td>
										<td><input type="text" name="lastName" /></td>
									</tr>

									<tr>
										<td>Password:</td>
										<td><input type="password" name="password" /></td>
									</tr>

									<tr>
										<td>Email:</td>
										<td><input type="email" name="email" /></td>
									</tr>
									<tr>
										<td>Picture:</td>
										<td>

											<div class="file-field input-field">
												<div class="btn">
													<span>File</span> <input name = "profileImage" type="file">
												</div>
												<div class="file-path-wrapper">
													<input class="file-path validate" type="text">
												</div>
											</div>

										</td>
									</tr>
									<tr>
										<td></td>
										<td><button type="submit" class="btn  purple accent-4" >Submit</button></td>
									</tr>
								</table>
									<p class="flow-text" id="result"></p>
								<input type="hidden" name="crudCall" value="newuser">
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<br />
	<br />

</body>
</html>