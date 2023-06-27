class constructor{
  int id;
  String name;  
  //creating a parameterized constructor  
  constructor(int i,String n){  
  id = i;  
  name = n;  
  }  
  //method to display the values  
  void display(){System.out.println(id+" "+name);}  
 
  public static void main(String args[]){ 
  constructor s1 = new constructor(111,"Karan");
  constructor s2 = new constructor(222,"Aryan");

  s1.display();
  s2.display();
 }
}