package Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
		

	}
	static void print(int n)
	{
		int a=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n+1-i;j++)
			{
				System.out.print(j);
			System.out.print("new change");
			}
			
			System.out.println();
		}
	}

}
