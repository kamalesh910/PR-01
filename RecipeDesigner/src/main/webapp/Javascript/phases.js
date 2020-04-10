/**
 * 
 */
 //Show Instruction
 class ShowIns {
  constructor(id,recipe,instruction ) {
    this.id=id;
    this.recipe = recipe;
    this.instruction = instruction;
  }
  // Getter
  setIns(ins) {
    this.instruction = ins;
  }
  // Method
  getName(ins) {
    return this.recipe;
  }
}

//Get Processing Value
 class GPV {
  constructor(id,recipe,instruction,highL,lowL ) {
    this.id=id;
    this.recipe = recipe;
    this.instruction = instruction;
    this.highL = highL;
    this.lowL = lowL;
  }
  // setter
  setIns(ins) {
    this.instruction = ins;
  }
   setHighLimit(highL) {
    this.highL = highL;
  }
   setLowLimit(lowL) {
    this.lowL = lowL;
  }
}


//Get Text Value
 class GTV {
  constructor(id,recipe,instruction,minL,maxL ) {
    this.id=id;
    this.recipe = recipe;
    this.instruction = instruction;
    this.minL = minL;
    this.maxL = maxL;
  }
  // Setter
  setIns(ins) {
    this.instruction = ins;
  }
   setMinLength(minL) {
    this.minL = minL;
  }
   setmaxLength(maxL) {
    this.maxL = maxL;
  }
}