/**
 * 
 */
var cityv = document.getElementById("city");
function demo()
{
	if(!cityv.value)
		{
			alert("Empty city name Insert in format Ex city,Country");
		}
	else
		{
			window.location="getweather?city="+cityv.value.trim();
		}
}