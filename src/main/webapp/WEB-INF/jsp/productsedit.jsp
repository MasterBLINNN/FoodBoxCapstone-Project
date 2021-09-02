<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>

<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
<center>
<h2>Products Query</h2>

<p>${message}</p>

<form action="productdetailsedit" method="post">
  <label for="uid">Product Id::</label><br>
  <input type="text" id="uid" name="uid"><br><br>
  <input type="submit" value="Submit">
</form>



</body>
</html>