import java.util.*;
public class Calc1
{
	int a,b;
	double c,d;
	public Calc1(int a1,int b1)
	{
		a=a1;
		b=b1;
	}
	public void over(double c1,double d1)
	{
		c=c1;
		d=d1;
	}
	public void add()
	{
		int intadd;
		double doubleadd;
		intadd=a+b;
		doubleadd=c+d;
		System.out.println("Integer addition is: "+intadd);
		System.out.println("Double addition is: "+doubleadd);
	}
	public void sub()
	{
		int intadd;
		double doubleadd;
		intadd=a-b;
		doubleadd=c-d;
		System.out.println("Integer Subtraction is: "+intadd);
		System.out.println("Double Subtraction is: "+doubleadd);
	}
	public void mul()
	{
		int intadd;
		double doubleadd;
		intadd=a*b;
		doubleadd=c*d;
		System.out.println("Integer Multiplication is: "+intadd);
		System.out.println("Double Multiplication is: "+doubleadd);
	}
	public void div()
	{
		int intadd;
		double doubleadd;
		try {
			intadd=a/b;
			doubleadd=c/d;
			System.out.println("Integer division: "+intadd+" Double division: "+doubleadd);
		}
            catch(Exception e) {
            	System.out.println("division by 0 Error in Integer part");
            }
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
        }
        a=in.nextInt();
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
		Calc1 cal= new Calc1(a,b);
		cal.over(c,d);
		switch(op)
		{
			case 1:cal.add();break;
			case 2:cal.sub();break;
			case 3:cal.mul();break;
			case 4:cal.div();break;
            default: System.out.println("Please enter a correct number");break;
		}
	}
}