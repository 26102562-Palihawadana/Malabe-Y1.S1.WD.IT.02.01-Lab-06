import java.util.Scanner;

public class IT26102562Lab6Q3

{
	public static void main(String [] args)
	{
		int num;
		double rootMeanSqrt;
		double sum=0.0;
		num=0;
		int count=0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter positive integers (terminate input with -99): ");
		
		do
		{
			System.out.print("Enter a number: ");
			num=input.nextInt();
			
			if (num<0 && num!=-99)
			{
				System.out.print("Invalid Input. Please enter a positive integer or -99 to terminate ");
			}
			else if(num>0)
			{
				sum += (num*num);
				count++;
			}
			
		}while (num!=-99);
		
		rootMeanSqrt = Math.sqrt(sum/count);
		
		System.out.print("The Root Mean Square (RMS) is : ");
		System.out.print(rootMeanSqrt);
	}
}
		