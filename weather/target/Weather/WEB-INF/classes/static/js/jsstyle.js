/**
 * 
 */
var cityv = document.getElementById("city");
function demo()
{
	alert(cityv.value.trim());
	if(cityv.value.trim()=="")
		{
			alert("Empty city name Insert in format Ex city,Country");
		}
	else
		{
			window.location="getweather?city="+cityv.value.trim();
		}
}