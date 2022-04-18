package javapgmnconcepts;

public class MethodOverloadingTypePromotion {

	void sum(int a,float b){System.out.println(a+b);}  
	void sum(int a,int b,int c){System.out.println(a+b+c);}  



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingTypePromotion obj = new MethodOverloadingTypePromotion();
		
		//int a =29;
		obj.sum(20,90);//now second int literal will be promoted to long  
		obj.sum(20,20,20);  

	}

}
