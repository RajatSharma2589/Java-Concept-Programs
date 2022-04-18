package javapgmnconcepts;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//--------Method 1-------------
		int num=1235;
		int rev=0;
		while (num!=0){

			System.out.println("num is "+num);
			int rem = num % 10;
			System.out.println("rem is "+rem);
			rev = rev*10+rem;
			num =num/10;
		}
		System.out.println(rev);
	}
}

//-----method 2---------

/*int num=1235;
int rev=0;
for(;num!=0;num/=10){

	System.out.println("num is "+num);
	int rem = num % 10;
	System.out.println("rem is "+rem);
	rev = rev*10+rem;

}
System.out.println(rev);
 */




