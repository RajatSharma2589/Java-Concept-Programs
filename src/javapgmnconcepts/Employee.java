package javapgmnconcepts;

public class Employee {

	private int empid;
	private char ename;

	public void setEmpid(int eid)
	{

	empid=eid;

	}

	public int getEmpId()
	{

	return empid;

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();

		e.setEmpid(100);

		System.out.println(e.getEmpId());
		
		
		
		
	}

}
