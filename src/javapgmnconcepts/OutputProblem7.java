package javapgmnconcepts;

													
class staticOutputProblem7 {
	static int staticvariables;
	
	static
	{
		System.out.println("static block");
		staticvariables=30;
	}
	
	static void staticMethod()
	{
		System.out.println("staticMethod");
		System.out.println(staticvariables);
	}
	
	public class Problem7{static {System.out.println("pgm1");}}
		
	public static void main(String[] args) {
		
		staticOutputProblem7.staticvariables=50;
		staticOutputProblem7.staticMethod();
	}

	

}
