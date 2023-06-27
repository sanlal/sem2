// Java program to demonstrate working of
// interface

import java.io.*;

// A simple interface
interface In1 {

	// public, static and final
	final int a = 10;

	// public and abstract
	void display();
  void display1();
  void display2();
  void display3();
  void display4();
}




// A class that implements the interface.
 class TestClass implements In1 {

	// Implementing the capabilities of
	// interface.
	public void display(){
	System.out.println("display");
	}

  public void display1(){
    System.out.println("display1");
    }

  public void display2(){
    System.out.println("display2");
  }

  public void display3(){
    System.out.println("display3");
  }

  public void display4(){
    System.out.println("display4");
  }
	// Driver Code
	public static void main(String[] args)
	{
		TestClass t = new TestClass();
    //TestClass e = new TestClass(t);
		t.display();
    t.display1();
    t.display2();
    t.display3();
    t.display4();
    Hi s1 = new Hi();
    s1.x();
		System.out.println(a);
	}
}


class Hi extends TestClass{
  public void x(){
    System.out.println("I am inherited");
  }
}
