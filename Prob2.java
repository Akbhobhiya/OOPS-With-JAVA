// Write a Java program to read Employee details: employee id, name, salary. Display the
// details of employee whose salary is above 50K. You may use of constructors.

public class Prob2
{
	String name;
	int id,salary;
	public Prob2(String name,int id,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void show()
	{
		System.out.println("Name of Employee is: "+name);
		System.out.println("Id of Employee is: "+id);
		System.out.println("Salary of Employee is: "+salary);
	}
	public void shows()
	{
		if (salary>50000)
		{
			System.out.println("Name of Employee is: "+name);
		    System.out.println("Id of Employee is: "+id);
		    System.out.println("Salary of Employee is: "+salary);
		}
	}
	public static void main(String[] args)
	{
		Prob2[] emp;
		emp = new Prob2[5]; 
		emp[0]= new Prob2("Ashok",181403,89347798);
		emp[1]= new Prob2("Manish",181404,893447798);
		emp[2]= new Prob2("Mukesh",181211,47798);
		emp[3]= new Prob2("Sawai",181284,7798);
		emp[4]= new Prob2("Kumar",181406,89345798);
		for (int i = 0; i <5; i++){ 
            System.out.println("Eemployee " + i + " : " ); 
		    emp[i].show();
		}
		System.out.println("Employee with salary greater than 50k");
		for (int i = 0; i < 5 ; i++){ 
            System.out.println("Eemployee " + i + " : " ); 
		    emp[i].shows();
		}
	} 
}