<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="i" items="${data.weather}" >
	${i.id}<br>
	${i.main}<br>
	${i.description}<br>
	${i.icon}<br>
</c:forEach>
temp:- ${data.main.temp}<br>
presure:- ${data.main.pressure}<br>
humidity:- ${data.main.humidity}<br>
wind:- ${data.wind.speed} m/s<br>
date:- ${key.date}<br>
country:- ${data.sys.country}<br>
sunrise:- ${key.sunrise}<br>
sunset:- ${key.sunset}<br>
name:- ${data.name}<br>
day:- ${key.day}<br>
<img src="${key.icon}" alt="image not found" >
</body>
</html>