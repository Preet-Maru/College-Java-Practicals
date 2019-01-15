class pattern1
{
	public static void main (String[] args)
	{
		int rows=5;
		for(int i=1;i<=rows;i++)
			{
				for(int j=5;j>=i;j--)
				{
				if(i%2!=0)
					{
					System.out.print("*");
					}
				}	
				System.out.println();
			}
		for (int k=1;k<=rows;k++)
		{
			for(int l=1;l<=k;l++)
			{
				if(k%2!=0)
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}