import java.util.Scanner;
class Pattern93
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=n/2 &&(j==n/2-i || j==n/2+i))
					System.out.print(n/2+1-i);
				else if(i>n/2 &&(j==i-n/2 || j==n+n/2-i-1))
					System.out.print(i-n/2+1);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}