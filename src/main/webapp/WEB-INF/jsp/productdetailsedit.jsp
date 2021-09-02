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
<h2>Products Edit</h2>

<p>${message}</p>

<form action="productdetailsedit" method="post">
  <label for="id">Product Id:</label><br> <input type="text" id="id" name="id" value="${products.id}"><br>
   <label for="name">Name:</label><br> <input type="text" id="name" name="name" value="${products.name}"><br>
  <label for="price">Price:</label><br>  <input type="text" id="price" name="price" value="${products.price}"><br>
  
<label for="cuisine">Cuisine:</label><br> <input type="text" id="cuisine" name="cuisine" value="${products.cuisine}"><br>
<label for="quantity">Quantity:</label><br> <input type="text" id="quantity" name="quantity" value="${products.quantity}"><br>
  
  <label for="description">Description:</label><br> <input type="text" id="description" name="description" value="${products.description}"><br>
  
  <br>
  <input type="submit" value="Submit">
</form> 

<br><br><br>
<a href ="products">Show Products</a>

</body>
</html>