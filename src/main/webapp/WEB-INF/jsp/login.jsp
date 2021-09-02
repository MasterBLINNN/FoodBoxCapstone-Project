<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>


<!DOCTYPE html>

<html>



<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


</head>
<body>

<form action="login" method="post">
	 <div class="container">
	 
	 <br>
	 <center><p>${message}</p> </center>
	 
  <h1>Login:</h1>
  <br>
  <div class="card">
   <div class="card-body">
    <form action="<%=request.getContextPath()%>/register" method="post">

     <div class="form-group row">
      <label for="username" class="col-sm-2 col-form-label">Login : </label>
      <div class="col-sm-3">
       <input type="text" class="form-control" name="username"
        placeholder="Enter Login">
      </div>
     </div>

     <div class="form-group row">
      <label for="password" class="col-sm-2 col-form-label">Password : </label>
      <div class="col-sm-3">
       <input type="text" class="form-control" name="password"
        placeholder="Enter password">
      </div>
     </div>

     <button type="submit" class="btn btn-primary">Submit</button>
    </form>
   </div>
  </div>
 </div>
 


</body>
</html>