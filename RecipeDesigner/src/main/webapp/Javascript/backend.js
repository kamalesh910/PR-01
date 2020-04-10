//Variable decleration 
    var action=""
    var x1=0;
    var y1=0;
    var x2=0;
    var y2=0;
    var status=0;
  	var target="";
  	var dest="";
    var phaseName="";
  	
	
//	MAIN FUNCTION
function myFunction(phase) {	
   if(action=="connect")
   {
     lineConnector(phase);
   }
 
  else if(action=="delete")
   {
   clearLoc();
   phase.remove();
   }

  else if(action=="parallel")
   {
	parallelBlock(phase);
	clearLoc();
   }

  else if(action=="add")
  {
	console.log(action);
	addBlock(phase);
	clearLoc();
  } 

  else if(action=="phase")
  {
	console.log(action);
	replacePhase(phase);
	clearLoc();
  }
  }


//Line connector
function lineConnector(phase)
{
    if(status==0)
  {
    x1=parseInt(phase.getAttribute("x"))+parseInt(phase.getAttribute("width")/2);    
    y1=parseInt(phase.getAttribute("y"))+parseInt(phase.getAttribute("height"));
	target=phase.getAttribute("id");	
        status=1;		
  }   
    else if (status==1)
   {
      x2=parseInt(phase.getAttribute("x"))+parseInt(phase.getAttribute("width")/2);    
      y2=parseInt(phase.getAttribute("y"));
	  dest=phase.getAttribute("id");
      status=2;
          if(y2 < y1)
        {
             y1=y1-parseInt(phase.getAttribute("height"));
             y2=y2-parseInt(phase.getAttribute("height"));
        }
        lineAdd(); 
	    clearLoc();   
   }
}


//Action button click event
function deleteAc(btn)
{
action="delete";
allGray();
btn.setAttribute("style",'background-color:yellow;');
}

function replace(btn)
{
action="phase";
allGray();
btn.setAttribute("style",'background-color:yellow;');
}

function add(btn)
{
action="add";
allGray();
btn.setAttribute("style",'background-color:yellow;');
}

function parallel(btn)
{
action="parallel";
allGray();
btn.setAttribute("style",'background-color:yellow;');
}

function connectBlock(btn)
{
action="connect";
allGray();
btn.setAttribute("style",'background-color:yellow;');
}

//Phase Button click ACTION
function shwins(btn){
phaseName="Show instruction";
alldefault();
btn.setAttribute("style",'background-color:yellow;');
}

function gpval(btn){
phaseName="Get process Value";
alldefault();
btn.setAttribute("style",'background-color:yellow;');
}

function gtval(btn){
phaseName="Get text Value";
alldefault();
btn.setAttribute("style",'background-color:yellow;');
}

function test(btn){
phaseName="Test";
alldefault();
btn.setAttribute("style",'background-color:yellow;');
}


// Support  function to clear cache
function allGray()
{
	
document.getElementById("para").setAttribute("style",'background-color:default;');
document.getElementById("insert").setAttribute("style",'background-color:default;');	
document.getElementById("delt").setAttribute("style",'background-color:default;');
document.getElementById("conn").setAttribute("style",'background-color:default;');
document.getElementById("add").setAttribute("style",'background-color:default;');

}

function alldefault()
{
document.getElementById("shi").setAttribute("style",'background-color:default;');
document.getElementById("gtv").setAttribute("style",'background-color:default;');	
document.getElementById("gpv").setAttribute("style",'background-color:default;');

//
document.getElementById("tes").setAttribute("style",'background-color:default;');

}

function clearLoc(){
x1=0;
y1=0;
x2=0;y2=0;status=0;
}















