package javapgmnconcepts;

class A{
int nonstaticvariable;
static int staticvariable;

static void staticmethod()
{
	System.out.println(staticvariable);
}

void nonStaticMethod()
{
	System.out.println(staticvariable);
	System.out.println(nonstaticvariable);
}
}

public class Wordreverse {	
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub

	A.staticvariable=10;
	A.staticmethod();
	
	//A a1 = new A();
	//System.out.println(a1.nonstaticvariable);
	//System.out.println(a1.staticvariable);
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Object [] stringArray= new String[5];
		
		stringArray[1]="java";
		
		stringArray[2]=100;
		
		System.out.println(stringArray[1]);
		System.out.println(stringArray[2]);
	}
	*/
		
		
		
		
		
		
		
		/*String s ="I love India";
		String [] word = s.split(" ");
		String rev=" ";
		for(int i = word.length-1; i>=0; i--)
		{
			rev= rev+word[i];
		}
		System.out.println(rev);*/
	}
	


