package javapgmnconcepts;

interface X{
	public void print();
}

interface Y{ public void print();}

public class OutputProblem4 implements X,Y{
	

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("heelo world");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutputProblem4 op = new OutputProblem4();
		op.print();

	}



}
