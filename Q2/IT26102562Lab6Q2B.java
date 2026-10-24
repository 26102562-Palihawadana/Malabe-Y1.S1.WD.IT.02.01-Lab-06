import java.util.Scanner;

public class IT26102562Lab6Q2B
{
	public static void main(String [] args)
	{
		int count=0;
		String numbers="";
		int number;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter 10 numbers: ");
		
		while(count<10)
		{
			System.out.println("Enter number " + (count+1) + ": ");
			number=input.nextInt();
			numbers= numbers + " " + number;
			count++;
		}
		
		System.out.print("The numbers you entered are: ");
		
		System.out.print(numbers);			
	}
}