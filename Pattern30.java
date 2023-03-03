import java.util.Scanner;
class Pattern30
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=n;j>0;j--)
			{
				if(j>i)
					System.out.print(" ");
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
}