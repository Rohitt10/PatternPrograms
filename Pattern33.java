import java.util.Scanner;
class Pattern33
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<i)
					System.out.print(" ");
				else
					System.out.print(j-i+1);
			}
			System.out.println();
		}
	}
}