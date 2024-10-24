package Day1_oops;

import java.util.Scanner;

class operation
{
	
	void sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("Vote");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
	void ifelseladder(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks :");
		int mark=sc.nextInt();		
		if(mark>=85)
		{
			System.out.println("A+ grade ...!!");
		}
		else if(mark>=75)
		{
			System.out.println("A grade...!!");
		}
		else if(mark>=65)
		{
			System.out.println("B+ grade...!!");
		}
		else if(mark>=55)
		{
			System.out.println("B grade...!!");
		}
		else if(mark>=45)
		{
			System.out.println("C+ grade...!!");
		}
		else if(mark>=35)
		{
			System.out.println("C grade...!!");
		}
		else
		{
			System.out.println("☠️ WOW You Are Fail...!!☠️");
		}
		
	}
	
	void forloop()
	{
		for(int hotel=1;hotel<=5;hotel++)
		{
			for(int room=1;room<=5;room++)
			{
				System.out.println("Diamond");			
			}

		}
	}
	
	
	
	
	
	void whileloop()
	{
		int i=0;
		while(i<=5)
		{
			System.out.println("Hello fortune");
			i++;
		}
		
	}
	
	
	
	void switchcase() {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First number : ");
	double a=sc.nextInt();
	System.out.println("Enter the second number : ");
	double b=sc.nextInt();
	
	System.out.println("1. addition");
	System.out.println("2. substraction :");
	System.out.println("3. multiplication :");
	System.out.println("4. division :");

	System.out.println("Enter choice for opration :");
	int choice=sc.nextInt();
	switch(choice)
	{
		case 1:
		double c=a+b;
		System.out.println("Addition is :"+c);
		break;
		
		case 2:
		double d=a-b;
		System.out.println("substraction is :"+d);
		break;

		case 3:
		double e=a*b;
		System.out.println("Multiplication is :"+e);
		break;

		case 4:
		double f=a/b;
		System.out.println("division is :"+f);
		break;

		default :
			System.out.println("Your Choise is not matched...!!!");
	}

}

}
		




public class Demo 
{

	public static void main(String[] args) 
	{
		operation c1=new operation();
		c1.ifelseladder();
		c1.switchcase();
		c1.sum();
		c1.whileloop();
		c1.forloop();




	}

}
