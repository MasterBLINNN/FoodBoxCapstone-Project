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
<h2>Products</h2>

<p><a href ="/">Logout</a><br><br>

<table style="float:middle">
   <tr><th>ID</th><th>Name</th><th>Price</th><th>cuisine</th><th>quantity</th><th>description</th></tr>
   <c:forEach items="${products}" var="products" varStatus="count">
    <tr id="${count.index}">
        <td>${products.id}</td> 
        <td>${products.name}</td>
        <td>${products.price}</td>
        <td>${products.cuisine}</td>
        <td>${products.quantity}</td>
        <td>${products.description}</td>
       
    </tr>
    
  </c:forEach>
</table>
<br>
<br><br>
<label for="buy">Buy Product:</label><br>
  <input type="text" id="product" name="product"><br>

<a href ="payment">Buy</a>
<br><br><br><br><br><br><br><br><br><br><br><br>

<a href ="productdetailsedit">Edit Products - Just Admin</a>
</center>

</body>
</html>