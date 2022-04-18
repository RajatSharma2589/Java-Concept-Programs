package javapgmnconcepts;

public class Aggregation {

	int empid;
	String name;
	EmpAddress address;
	
	public Aggregation(int empid,String name,EmpAddress address)
	{
	this.empid = empid;
	this.name = name;
	this.address = address;
		
	}
	 void display()
	 {
		 System.out.println(empid+ " " + name);
		 System.out.println(address.city+" "+address.state+" "+address.country);
	 }

	
	public static void main(String[] args) {
		
		EmpAddress ad1 = new EmpAddress("bangalore ","Karnataka ","India");
		EmpAddress ad2 = new EmpAddress("Hyd ","Andhra ","India");

		Aggregation ag = new Aggregation(1, "Rj", ad1);
		Aggregation ag2 = new Aggregation(3, "SRS", ad2);
		
		ag.display();
		ag2.display();
		
		
		
	}

}
