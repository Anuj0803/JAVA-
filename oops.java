package net.codejava;
import java.util.*;

// creating interface
interface sww
{
void sum();    // method inside interface do not have body inside the interface
}
interface fee
{
	void del();
}
//class creation and use of scanner class to input in java & also an abstract class so you can not create object...you can call my methods by my child class
abstract class sum
{
	void mul()
	{
		System.out.println("enter values of a and b");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b= s.nextInt();
	     int c= a*b;
		System.out.println("value of c is "+c);
		s.close();
	}
}
//single inheritence in class and use of static method
class div extends sum
{
	static void min()
	{
		System.out.println("I am static method and you can only call me through my claass name(div) and i am inherited from class sum");
	}
}
// Multiple inheritence in interface and call me by my class name
class add implements sww,fee
{
	public void sum()
	{
		System.out.println("I am inherited from a Interface");
	}
	public void del()
	{
		System.out.println("I am here for multiple inheritence in Interface");
	}
}
//overloading
class  A
{
	 void run()
	{
		System.out.println("A");
	}
	void run(int x)
	{
		System.out.println("x");
		this.run();
	}
	//constructor
	void A (int x)
	{
		System.out.println("constructor");
	}
}
// override 
class B extends A
{
	void run()
	{
		System.out.println("B");
		super.run();
	}
}
//Thread
class Multi extends Thread
{  
public void run()
{  
System.out.println("thread is running...by extending Thread class");  
}  
}
class Multi3 implements Runnable
{
	public void run()
	{
		System.out.println("thread is running...by implementing Runnable interface"+Thread.currentThread().getName());
		System.out.println("thread is running...by implementing Runnable interface"+Thread.currentThread().getPriority());
	}
}
public class OOPS 
{
	public static void main(String[] args) 
	{
		div d= new div();
		d.mul();
		div.min();
		add a = new add();
		a.sum();
        a.del();
        B x= new B();
        x.run();
        x.run(2);
        x.A(7);
		Multi t1=new Multi();  
		t1.start();  
		Multi3 m1=new Multi3();
		Thread t2=new Thread(m1);  
		t2.start();
     }
}