// Create a class Area. Define constructors for the class to calculate area of the circle if radius
// is provided as parameter or else calculate the area of rectangle given length and breadth valuec;
class Prob3
{
	float r,l,b;
	double areac,arear;
	public Prob3(float r)
	{
		this.r=r;
	}
	public Prob3(float l,float b)
	{
		this.l=l;
		this.b=b;
	}
	public void areaC()
	{
		areac= 3.14*r*r;
	}
	public void areaR()
	{
		arear=l*b;
	}
	public void showc()
	{
		System.out.println("Area of Circle is:  "+areac);
	}
	public void showr()
	{
		System.out.println("Area of Rectangle is:  "+arear);
	}
	public static void main(String args[])
	{
		Prob3 circle =new Prob3(12);
	    Prob3 rac =new Prob3(12,12);
	    circle.areaC();
	    rac.areaR();
	    circle.showc();
     	rac.showr();
	}
} 