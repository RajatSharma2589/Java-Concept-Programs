package javapgmnconcepts;

class A
{
	public void display()
	{
System.out.println("this is parent method");		
	}
}
class B extends A
{
	public void display()
	{
System.out.println("this is child method");		
	}
}


public class  DemoMethodOveriding{  
	
	  public static void main(String args[]){  
	  A obj = new B();//creating object  
	  obj.display();//calling method  
	  }  
	}  