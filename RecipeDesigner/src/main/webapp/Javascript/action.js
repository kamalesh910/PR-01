
var x="x";
var y="y";
var height=60;
var width=200;

function promptP()
{
prompt("Recipe Name");

}

//Phase image function 
function phaseImg(block){
	if(phaseName=="Show instruction")
	block.setAttribute('href',"Images/showins.png");
    if(phaseName=="Get process Value")
	block.setAttribute('href',"Images/gpv.png");
    if(phaseName=="Get text Value")
	block.setAttribute('href',"Images/gtv.png");
    if(phaseName=="Test")
	block.setAttribute('href',"Images/test.png");
}

//Action Insert Parallel Add Connect Function
function replacePhase(refLoc){
phaseImg(refLoc);
refLoc.setAttribute('name',phaseName);

//isEmpty
refLoc.setAttribute("isempty","0");
clearLoc();	
}

function parallelBlock(phase){
 var ex=100;
 var id=phase.getAttribute("x")+x+phase.getAttribute("y")+y;
var block = document.createElementNS('http://www.w3.org/2000/svg','image');
block.setAttribute('id',id);
block.setAttribute('x',parseInt(phase.getAttribute("x"))+ex);
block.setAttribute('y',parseInt(phase.getAttribute("y")));
block.setAttribute('height',height);
block.setAttribute('width',width);
block.setAttribute('isempty','0');
block.setAttribute('href',"Images/blank.png");
block.setAttribute('ondblclick', "myFunction(this)");
block.setAttribute('onclick', "editParameter(this)");
phase.setAttribute("x",parseInt(phase.getAttribute("x"))-ex);
document.querySelector("SVG").append(block);
clearLoc();
}

function addBlock(refLoc){
 var extra=100;
 var id=refLoc.getAttribute("x")+x+refLoc.getAttribute("y")+y;
var block = document.createElementNS('http://www.w3.org/2000/svg','image');
block.setAttribute('id',id);
block.setAttribute('x',parseInt(refLoc.getAttribute("x")));
block.setAttribute('y',parseInt(refLoc.getAttribute("y"))+extra);
phaseImg(block);
block.setAttribute('height',height);
block.setAttribute('width',width);
block.setAttribute('isempty','0');
block.setAttribute('name',phaseName);
block.setAttribute('ondblclick', "myFunction(this)");
block.setAttribute('onclick', "editParameter(this)");
document.querySelector("SVG").append(block);
clearLoc();
}

function lineAdd(){
 var newLine = document.createElementNS('http://www.w3.org/2000/svg','line');
newLine.setAttribute('id','line2');
newLine.setAttribute('x1',x1);
newLine.setAttribute('y1',y1);
newLine.setAttribute('x2',x2);
newLine.setAttribute('y2',y2);
newLine.setAttribute('onclick', "myFunction(this)")
document.querySelector("SVG").append(newLine);
newLine.setAttribute('style',"fill:rgb(0,0,255);stroke-width:2;stroke:rgb(0,0,0)");
document.querySelector
console.log("added line");
clearLoc();
}




