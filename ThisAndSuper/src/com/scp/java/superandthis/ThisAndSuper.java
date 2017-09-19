package com.scp.java.superandthis;

public class ThisAndSuper
{

	static{System.out.println("Inside S's static block");}
	{System.out.println("inside S's instance block");}
	

public static void main(String arg[])
{
	System.out.println("Inside main method");
	//A a1 =new A();
	B b1 = new B();
	
	}
}
class A
{
	String avalue;
	static{System.out.println("Inside A's static block1");}
	{System.out.println("Inside A's instance block1");}
	//static{System.out.println("Inside A's static block2");}
	//{System.out.println("Inside A's instance block2");}
public A(String avalue)
{
	super();
	this.avalue=avalue;
	System.out.println("Inside the A's Pramiterize Constructor");
}
public A()
{
	System.out.println("Inside the A's default Constructor");
}
	
}


class B extends A
{
	
	String bvalue;
	static{System.out.println("Inside B's static block1");}
	{System.out.println("Inside B's instance block1");}
	
public B(String bvalue)	
{
	super("A");
	this.bvalue=bvalue;
	System.out.println("Inside the B's Pramiterize Constructor");
	}
	public B()
	{
		super();
		System.out.println("Inside the B's default Constructor");
	}
}
