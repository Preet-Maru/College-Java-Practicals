import java.util.*;
class DecimalToBinary
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Decimal Number:");
		int num=scan.nextInt();
		//int length=num;
		String str="";
		while(num>0)
		{
			int remainder=num%2;
			str=remainder+" "+str;
			num=num/2;
		}
		System.out.println("Binary is:"+str);
	}
}