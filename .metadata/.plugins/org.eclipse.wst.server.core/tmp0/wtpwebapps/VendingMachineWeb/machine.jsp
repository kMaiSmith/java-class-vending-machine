<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<title>AwsomeCo Vending Machine</title>
</head>

<body>

<h1>Message: <c:out value="${machine.message}" /></h1>
<h1>Balance: <c:out value="${machine.balance}" /></h1>

<div>
<form name="vmform" method="post" action="insertcoin">
<label>Coin Slot</label>
<input name="insertcoin" type="text" value="type in a coin">
<input type="submit" value="insert thine coin">
</form>
</div>


</body>

</html>