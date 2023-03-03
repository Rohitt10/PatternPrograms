import java.util.Scanner;
class Pattern27
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		for(int i=65;i<65+n;i++)
		{
			for(int j=65+n-1;j>=65;j--)
			{
				if(j>i)
					System.out.print(" ");
				else
					System.out.printf("%c",i);
			}
			System.out.println("");
		}
	}
}
