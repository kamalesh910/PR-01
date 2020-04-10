//FC
function block(refernace){	
 var phase = document.createElementNS('http://www.w3.org/2000/svg','g');
 phase.setAttribute('id',parseInt(thi.getAttribute("x")));
 
 //Block
 var block = document.createElementNS('http://www.w3.org/2000/svg','rect');
block.setAttribute('id',parseInt(thi.getAttribute("x"))+ex);
block.setAttribute('x',parseInt(thi.getAttribute("x"))+ex);
block.setAttribute('y',parseInt(thi.getAttribute("y")));
block.setAttribute('height',parseInt(thi.getAttribute("height")));
block.setAttribute('width',parseInt(thi.getAttribute("width")));
block.setAttribute("fill", "gray");
block.setAttribute('onclick', "myFunction(this)");
block.setAttribute('style','border-color:black');

//Parameter

 
 //TextField
var name = document.createElementNS('http://www.w3.org/2000/svg','text');
name.setAttribute('id', parseInt(thi.getAttribute("x"))+exb);
name.setAttribute('x',parseInt(thi.getAttribute("x"))+exb);
name.setAttribute('y',parseInt(thi.getAttribute("y"))+ex);
name.setAttribute('font-family',"sans-serif");
name.setAttribute('font-size',"15px");
name.setAttribute("fill", "yellow");
thi.setAttribute("fill",'gray');
 }
 
function phaseBlock(){
	
 var name  = phaseName(refernace);
 var parameter = phasePara(refernace);
 
 var block = document.createElementNS('http://www.w3.org/2000/svg','rect');
block.setAttribute('id',id);
block.setAttribute('x',parseInt(thi.getAttribute("x"))+ex);
block.setAttribute('y',parseInt(thi.getAttribute("y")));
block.setAttribute('height',parseInt(thi.getAttribute("height")));
block.setAttribute('width',parseInt(thi.getAttribute("width")));
block.setAttribute("fill", "gray");
block.setAttribute('onclick', "myFunction(this)");
block.setAttribute('style','border-color:black');
return block;
};

function phaseName(){
	var name = document.createElementNS('http://www.w3.org/2000/svg','text');
name.setAttribute('id', parseInt(thi.getAttribute("x")));
name.setAttribute('x',parseInt(thi.getAttribute("x"))+exb);
name.setAttribute('y',parseInt(thi.getAttribute("y"))+ex);
name.setAttribute('font-family',"sans-serif");
name.setAttribute('font-size',"15px");
name.setAttribute("fill", "yellow");
thi.setAttribute("fill",'gray');
document.querySelector("SVG").append(block);
document.getElementById(parseInt(thi.getAttribute("x"))).innerHTML=phaseName;
return block;
};
