package javapgmnconcepts;

public class PrimeNumbers {

	 void isprime(int n)
	{
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not Prime");
				
			}
			else{
				System.out.println("not prime");
			}
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeNumbers pm =new PrimeNumbers();
		pm.isprime(2357);
		/*for(int i=2;i<=n/2;i++)
		{
			int num = n/i;
		
			double  rem = n%i;
			
		System.out.println("number= "+i);	
			if(rem==0)
			{
				System.out.println("Not Prime");
				System.out.println("number= "+i);	
			}
		
			}
		}*/
		
	}
	
		
		
		
	}

