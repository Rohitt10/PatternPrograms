import java.util.Scanner;
class Pattern58
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int k=65+n/2-i;
			int l=65+i-n/2;
			for(int j=0;j<=n/2;j++)
			{
				if(i<=n/2 && j<=i)
					System.out.printf("%c",k++);
				else if(i>n/2 && j<n-i)
					System.out.printf("%c",l++);
			}
			System.out.println();
		}
	}
}