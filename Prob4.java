// Assume that there a class Car with model number as its member variable. Write a Java
// program to swap the values of model number in Car objects c1 and c2.

class Prob4
{
	int number;
	public Prob4(int number)
	{
		this.number=number;
	}
	public static void swap(Prob4 c1, Prob4 c2) 
	{ 
		int temp = c1.number; 
		c1.number = c2.number; 
		c2.number = temp; 
	}
	public static void main(String args[])
	{
		Prob4 c1 =new Prob4(12131);
	    Prob4 c2 =new Prob4(12322);
	    System.out.println("Before Swapping");
	    System.out.println("c1.no = " + c1.number); 
		System.out.println("c2.no = " + c2.number);
	    swap(c1,c2);
	    System.out.println("After Swapping");
	    System.out.println("c1.no = " + c1.number); 
		System.out.println("c2.no = " + c2.number); 
	}
}