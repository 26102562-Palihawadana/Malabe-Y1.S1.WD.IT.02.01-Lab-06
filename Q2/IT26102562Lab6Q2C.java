import java.util.Scanner;

public class IT26102562Lab6Q2C
{
	public static void main(String [] args)
	{
		int count=0;
		String numbers="";
		int number;
		int total = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter 10 numbers: ");
		
		while(count<10)
		{
			System.out.print("Enter number " + (count+1) + ": ");
			number=input.nextInt();
			numbers= numbers + " " + number;
			total +=number;
			count++;
		}
		
		System.out.println("The numbers you entered are: ");
		
		System.out.println(numbers);
			
		System.out.println("The sum is : " + total);
		
		double avg=total/10;
		System.out.println("The avg is : " + avg);
	}
}