<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>NEW PASSWORD</title>
	<style>
		body {
		 background-image: url('https://th.bing.com/th?id=OIP.3kFTNDIN0xO1gwFtsDUukwHaEo&w=316&h=197&c=8&rs=1&qlt=90&o=6&dpr=1.1&pid=3.1&rm=2'); background-size: cover;
			background-color: #f0f0f0;
			font-family: Arial, sans-serif;
		}
		
		h1 {
			text-align: center;
			color: #333;
			margin-top: 50px;
		}
		
		form {
			display: flex;
			flex-direction: column;
			align-items: center;
			background-color: #fff;
			box-shadow: 0px 0px 10px rgba(0,0,0,0.2);
			padding: 20px;
			margin-top: 20px;
			border-radius: 5px;
			width: 400px;
			margin: 0 auto;
		}
		
		input[type=email], input[type=password] {
			padding: 10px;
			margin: 10px;
			border: none;
			border-radius: 5px;
			box-shadow: 0px 0px 5px grey;
			width: 300px;
			font-size: 18px;
			color: #555;
		}
		
		input[type=submit] {
			background-color: #4286f4;
			color: white;
			padding: 10px;
			border: none;
			border-radius: 5px;
			box-shadow: 0px 0px 5px grey;
			cursor: pointer;
			width: 300px;
			font-size: 18px;
			text-align: center;
			margin: 10px;
		}
		
		input[type=submit]:hover {
			background-color: #3366cc;
		}
	</style>
</head>
<body>
	<h1>ENTER EMAIL AND NEW PASSWORD</h1>
	<form method="post" action='ForgotPassword'>
		<label for="email">Email:</label>
		<input type="email" id="email" name="email" required><br><br>
		
		<label for="new-password">New Password:</label>
		<input type="password" id="new-password" name="password" required><br><br>
		
		<input type="submit" value="Submit">
	</form>
</body>
</html>