<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>

<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
<h2>Register</h2>

<p>${message}</p>

<form action="register" method="post">
	<label for="email">Email:</label><br>
  <input type="email" id="email" name="email"><br>
  <label for="name">UserName:</label><br>
  <input type="name" id="name" name="name"><br>
  <label for="password">Password:</label><br>
  <input type="password" id="password" name="password"><br>
  <br>
  
  <br>
  <input type="submit" value="Submit">
 
</form> 



</body>
</html>