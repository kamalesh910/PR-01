<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Designer</title>
<link rel="stylesheet" href="Css/style.css">
<script src="Javascript/backend.js"></script>
<script src="Javascript/action.js"></script>
<script src="Javascript/blockClick.js"></script>

<script>
	function preventBack(){
		window.history.forward();
	}
	setTimeout("preventBack()",0);
	window.onload=function(){null};
	</script>
</head>
<body>
	<style>
middle {
	border-style: solid;
}

body {
	font-family: Arial, Helvetica, sans-serif;
}

.navbar {
	overflow: hidden;
	background-color: #333;
}

.navbar a {
	float: left;
	font-size: 16px;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.dropdown {
	float: left;
	overflow: hidden;
}

.dropdown .dropbtn {
	font-size: 16px;
	border: none;
	outline: none;
	color: white;
	padding: 14px 16px;
	background-color: inherit;
	font-family: inherit;
	margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
	background-color: #008000;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	float: none;
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown-content a:hover {
	background-color: #ddd;
}

.dropdown:hover .dropdown-content {
	display: block;
}

#BUTTON button {
	height: 25px;
	width: 150px;
	color: black;
	font-size: 15px;
	background-color:lavender;
}

#btn button {
	height: 25px;
	width: 80px;
	color: black;
	font-size: 15px;
	background-color:lavender;
}
*button {
	background-color:lavender;
}
#parameter {
	height: 400px;
	width: 230px;
	margin: 10px;
	background-color: white;
}

#details {
	height: 60px;
	width: 230px;
	margin: 10px;
	color: white;
}

* label{
	font-size: 20px;
}
</style>
	
	<div class="navbar">
		<div class="dropdown">
			<button class="dropbtn">File 
			  <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">			
				<input id="recipename" height="50" width="100" placeholder="New" ></input>
				<button onclick="disable()">Save</button>
				<br>
				<br>
				<br>		
				<input id="recipe" height="50" width="100" placeholder="Open" ></input>
				<button onclick="loadRecipe()">Load</button>
			</div>
		  </div> 
		  <a href="#home">Edit</a>
		  <a href="#news">View</a>
		  <a href="#news">help</a>
		</div>
		
<script>
function disable(){
	document.getElementById("recipename").disabled=true;
	localStorage.setItem(document.getElementById("recipename").value,document.querySelector("svg").innerHTML);
    console.log("disable");
}

function loadRecipe(){
	document.querySelector("svg").innerHTML=localStorage.getItem(document.getElementById("recipe").value);
	document.getElementById("recipename").value=document.getElementById("recipe").value;
	document.getElementById("recipe").value="";
	document.getElementById("recipename").disabled=true;
	document.getElementById("parameter").innerHTML="";
	
}


</script>
	
	
	<div id="container">

		<div id="setlist" style="border-style: ridge;">
			<h1 align="center" style="color: white;">SETLIST</h1>
			 <div id="BUTTON" style="margin: 10; padding: 10;">
				<ul style="list-style-type: square;">
					<li><button type="button" id="shi" onclick="shwins(this)">Show
							Instruction</button></li>
					<br>
					<li><button type="button" id="gtv" onclick="gtval(this)">Get
							Text</button></li>
					<br>
					<li><button type="button" id="gpv" onclick="gpval(this)">Get
							Processing Value</button></li>
					<br>
					<li><button type="button" id="tes" onclick="test(this)">TEST</button></li>
				</ul>
			</div>
		</div>


		<div id="workspace" style="border-style: ridge;">
			<h1 align="center" style="color: white; background-color: #333">WORKSPACE</h1>
			<div id="control" style="height: 40px">
				<div id="btn" align="center" style="padding-top: 7px;">
					
					<button id="add" onclick="add(this)" style="font-color: yellow;">Add</button>

					<button id="delt" onclick="deleteAc(this)"
						style="font-color: blue;">Delete</button>

					<button id="conn" onclick="connectBlock(this)"
						style="font-color: pink;">Connect</button>

					<button id="para" onclick="parallel(this)"
						style="font-color: black;">Parallel</button>

                    <button id="insert" onclick="replace(this)"
						style="font-color: white;">Replace</button>
						
				</div>
			</div>
			<div id="workflow">
			<svg height=590px ; 
    width=650px
				;
            style="border: 1px solid black">

<image id="start" x="250" y="10" href="Images/start.png" height="60" width="200" onclick="editParameter(this)" ondblclick="myFunction(this)"></image>

 </svg>
 </div>
		</div>

		<div id="view" style="border-style: ridge;">
			<h1 align="center" style="color: white;">View</h1>
			<div id="details">
				<h3 align="center">Basic Details</h3>
				<br>
				<p id="rname" for="fname">Workflow :</p>

				
			</div>

			<div id="parameter">
				<h3 align="center">Parameter Details</h3>
			</div>
	
<button onclick="updateSVG()">save</button>
	</div>

	</div>

</body>
</html>