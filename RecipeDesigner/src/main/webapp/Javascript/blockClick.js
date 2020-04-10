var selectedBlock="";

function editParameter(phase){
    selectedBlock=phase.getAttribute("id");
    var phaseType= document.getElementById(selectedBlock).getAttribute("name");
    var isEmpty= document.getElementById(selectedBlock).getAttribute("isempty");
    if(phaseType=="Show instruction") 
    {
      if(isEmpty=="0"){
        shi();
       }
       else{
         shwinsLoad();
       }
    }	
    else if(phaseType=="Get process Value")
    {
      if(isEmpty=="0"){
        gpv();
       }
       else{
         gpvLoad();
       }
    }	
    else if(phaseType=="Get text Value")
    {
      if(isEmpty=="0"){
        gtv();
       }
       else{
         gtvLoad();
       }
    }
}

// PARAMETER VIEW CHANGE LOGIC
function gpv()
{
	document.getElementById("parameter").innerHTML=" <label for=\"fname\">Instruction :</label><br><input type=\"text\" id=\"instruction\" name=\"instrcution\"> <br><br> 	<label for=\"low\">Low Limit:</label> <br> <input type=\"text\" id=\"lowlimit\" name=\"low\"><br> <br> <label for=\"high\">High Limit:</label> <br> <input	type=\"text\" id=\"highlimit\" name=\"high\"><br>"	
}

function gtv()
{
	document.getElementById("parameter").innerHTML=" <label for=\"fname\">Instruction :</label> <br><input type=\"text\" id=\"instruction\" name=\"instrcution\"> <br><br> 	<label for=\"low\">Min Length:</label> <br> <input type=\"text\" id=\"minlength\" name=\"low\"><br> <br> <label for=\"high\">Max Length:</label> <br> <input	type=\"text\" id=\"maxlength\" name=\"high\"><br>"	
}

function shi()
{
	document.getElementById("parameter").innerHTML=" <label for=\"fname\">Instruction :</label> <br><input type=\"text\" id=\"instruction\" name=\"instrcution\"> <br><br> "
}

//UPDATE SVG WORKFLOW
function updateSVG(){
var phaseType= document.getElementById(selectedBlock).getAttribute("name");
var isEmpty= document.getElementById(selectedBlock).getAttribute("isEmpty");
    console.log(phaseType);
if(phaseType=="Show instruction") 
    shwinsUpdate();
else if(phaseType=="Get process Value")
    gpvUpdate();
else if(phaseType=="Get text Value")
    gtvUpdate();
}

//Update svg PHASE 
function shwinsUpdate(){
	
document.getElementById(selectedBlock).setAttribute("instruction",document.getElementById("instruction").value);

//isEmpty
document.getElementById(selectedBlock).setAttribute("isempty","1");
}

function gtvUpdate(){
	
document.getElementById(selectedBlock).setAttribute("instruction",document.getElementById("instruction").value);
document.getElementById(selectedBlock).setAttribute("maxlength",document.getElementById("maxlength").value);
document.getElementById(selectedBlock).setAttribute("minlength",document.getElementById("minlength").value);

//isEmpty
document.getElementById(selectedBlock).setAttribute("isempty","1");
}

function gpvUpdate(){
	
document.getElementById(selectedBlock).setAttribute("instruction",document.getElementById("instruction").value);
document.getElementById(selectedBlock).setAttribute("lowlimit",document.getElementById("lowlimit").value);
document.getElementById(selectedBlock).setAttribute("highlimit",document.getElementById("highlimit").value);

//isEmpty
document.getElementById(selectedBlock).setAttribute("isempty","1");
}

//load svg phase
function shwinsLoad(){  
	console.log("shi LOAD");
  var instruction=document.getElementById(selectedBlock).getAttribute("instruction");
  shi();
  document.getElementById("instruction").setAttribute("value",instruction);
}

function gtvLoad(){
	console.log("gtv load");
  var instruction=document.getElementById(selectedBlock).getAttribute("instruction");
  var maxLength=document.getElementById(selectedBlock).getAttribute("maxlength");
  var minLength=document.getElementById(selectedBlock).getAttribute("minlength");
  gtv(); 
  document.getElementById("instruction").setAttribute("value",instruction); 
  document.getElementById("maxlength").setAttribute("value",maxLength);
  document.getElementById("minlength").setAttribute("value",minLength);
}

function gpvLoad(){
	console.log("gpv load");
  var instruction=document.getElementById(selectedBlock).getAttribute("instruction");
  var lowLimit=document.getElementById(selectedBlock).getAttribute("lowlimit");
  var highLimit=document.getElementById(selectedBlock).getAttribute("highlimit");
  gpv();
  document.getElementById("instruction").setAttribute("value",instruction); 
  document.getElementById("lowlimit").setAttribute("value",lowLimit);
  document.getElementById("highlimit").setAttribute("value",highLimit);
}
