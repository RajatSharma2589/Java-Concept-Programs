package javapgmnconcepts;

public class LooseCoupling {
	
	}

final class Box 
{
     private int volume;
     Box(int length, int width, int height) 
     {
         this.volume = length * width * height;
     }
     public int getVolume() 
     { 
         return volume; 
           
     }
	

public static void Main(String args[]) 
{
    Box b = new Box(5,5,5);
    System.out.println(b.getVolume());
}
}


