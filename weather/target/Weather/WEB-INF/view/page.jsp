<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>weather page</title>
<link rel="stylesheet" href="css/style.css"> 
</head>
<body class="divstyle1">
    <div>
	    <div class="divstyle11">${key.day} , ${key.date}</div>
        <div class="divstyle2">
			    <div class="divstyle3">
	                <input type="search" class="divstyle10" placeholder="Enter City,Country" autocomplete="off" id="city"  >
			    </div>
			    <div><input type="button" value="search" class="divstyle4" onclick="demo()"></div>
       </div>
    <div class="divstyle5">
        <div class="divstyle6">
				<div class="divstyle7">
					<div class="divstyle16 ">
					    <span class="divstyle18">${data.name},${data.sys.country}</span>
					</div>
				<div class="divstyle17">
					<div class="divstyle19"><span class="divstyle21">${data.main.temp} &#8451;</span></div>
					<div class="divstyle20">
						<img src="${key.icon}" class="divstyle22" alt="image not found">
						<div class="divstyle22">					
						<c:forEach var="i" items="${data.weather}" >
							${i.description}						
						</c:forEach>
						</div>						
					</div>
				</div>
			</div>
			
			<div class="divstyle8"></div>
		</div>
    <div class="divstyle9">
    <div class="divstyle12">
<p><img src="images/p1.png" class="divstyle13 divstyle14"></p>
				<p class="center">${data.main.humidity} %<br>Humidity</p>
</div>
    <div class="divstyle12">
<p><img src="images/p2.png" class="divstyle13 divstyle14"></p>
				<p class="center divstyle23">${data.main.pressure} hpa<br>Pressure</p>
</div>
    <div class="divstyle12">
<p><img src="images/p3.png" class="divstyle13 divstyle14"></p>
				<p class="center">${data.wind.speed} m/s<br>Wind</p>
</div>
    <div class="divstyle12">
<p><img src="images/p4.png" class="divstyle13 divstyle14"></p>
				<p class="center">${key.sunrise} UTC<br>Sunrise</p>
</div>
    <div class="divstyle12 divstyle15">
<p><img src="images/p5.png" class="divstyle13 divstyle14"></p>
				<p class="center">${key.sunset} UTC<br>Sunset</p>
</div>
</div>
</div>
</div>
    <script src="js/jsstyle.js"></script>
</body></html>