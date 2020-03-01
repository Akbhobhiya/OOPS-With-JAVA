import java.util.*;
public class Calc
{
	int a,b;
	double c,d;
	public Calc(int a1,int b1)
	{
		a=a1;
		b=b1;
	}
	public void over(double c1,double d1)
	{
		c=c1;
		d=d1;
	}
	public float addint()
	{
		return a+b; 
	}
	public float subint()
	{
		return a-b; 
	}
	public float mulint()
	{
		return a*b; 
	}
	public float divint()
	{
		return a/b;
	}
	public double adddouble()
	{
		return c+d; 
	}
	public double subdouble()
	{
		return c-d; 
	}
	public double muldouble()
	{
		return c*d; 
	}
	public double divdouble()
	{
		return c/d;
	}
	public static void main(String args[])
	{ 
		int a,b,op;
		double c,d;
		System.out.println("Enter the integer variable::");
		Scanner in= new Scanner(System.in);
		try 
        {  
            a=in.nextInt();
        }  
        catch (Exception e)  
        { 
            System.out.println("a is not a valid integer number");
            System.out.println("Enter Again");
            a=in.nextInt();
        }
        try 
        {  
            b=in.nextInt();
        }  
        catch (Exception e)  
        { 
            System.out.println("a is not a valid integer number");
            System.out.println("Enter Again");
            b=in.nextInt();
        }
        System.out.println("Enter the double variable::");
		c=in.nextDouble();
		d=in.nextDouble();
		System.out.println("Enter the Operators 1 for +, 2 for -, 3 for * and 4 for division::");
		op=in.nextInt();
		Calc cal= new Calc(a,b);
		cal.over(c,d);
		switch(op)
		{
			case 1:System.out.println("Integer addition: "+cal.addint()+" Double addition: "+cal.adddouble());break;
			case 2:System.out.println("Integer substraction: "+cal.subint()+" Double substraction: "+cal.subdouble());break;
			case 3:System.out.println("Integer multiplication: "+cal.mulint()+" Double multiplication: "+cal.muldouble());break;
			case 4:try {
				System.out.println("Integer division: "+cal.divint()+" Double division: "+cal.divdouble());break;
			}
            catch(Exception e) {
            	System.out.println("division by 0 Error in Integer part");
            }break;
            default: System.out.println("Please enter a correct number");break;
		}
	}
}