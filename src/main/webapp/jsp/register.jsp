<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
  <head>
    <meta http-equiv="content-type" content="application/xhtml+xml; charset=ISO-8859-1" />
    <title>Login</title>
    <%@ include file="/jsp/header.jsp" %>
  </head>

  <body>
<!--     <br><br><br><h1>Authorization</h1> -->
<!-- 	<h2>Log In</h2> -->
<!--   <form action="/loginuser" method="post"> -->
<!--     	Username: <input type="text" name="username"><br> -->
<!--     	Password: <input type="password" name="password"><br> -->
<!--     	<input type="submit" name="send" value="Log In"> -->
<!--     </form> -->
   
    <h2>Register</h2>
    <form action="/adduser" method="post">
    	Username: <input type="text" name="user"><br>
    	Password: <input type="password" name="pass"><br>
    	
    	<input type="submit" value="Register">
    </form>
  </body>
</html>