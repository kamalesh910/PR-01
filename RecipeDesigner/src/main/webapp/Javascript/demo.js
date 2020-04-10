/**
 * 
 */
  class User {
  constructor(id,name,age,address ) {
    this.id=id;
    this.name = name;
    this.age = age;
    this.address=address;
  }
  setId(id){
   this.id=id;
  }
  
  setName(name){
   this.name = name;
  }
  
  setAge(age){
    this.age = age;
  }
  
  setAddress(address){
    this.address=address;
  }
  }
  
 
  
  function createUser(){
  var id=document.getElementById("id").value;
  var name=document.getElementById("name").value;
  var age=document.getElementById("age").value;
  var address=document.getElementById("address").value;
  let user =new User(id,name,age,address);
  }