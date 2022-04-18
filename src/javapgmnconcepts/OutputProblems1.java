package javapgmnconcepts;

public class OutputProblems1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	BadMethod();
	System.out.println("A");
}
catch(RuntimeException ex)
{
	System.out.println("B");
}
catch(Exception ex1)
{
	System.out.println("C");
}
finally
{
	System.out.println("D");
}
System.out.println("E");
}

	public static void BadMethod()
	{
		throw new RuntimeException();
	}
}
