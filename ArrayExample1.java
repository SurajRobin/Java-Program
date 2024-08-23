package ArrayExamples;

public class ArrayExample1 {
	public static void main(String [] args)
	{
		int [] a=new int[5];
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for (int b=0; b<a.length; b++)
		{
			System.out.println(a[b]);
		}
		System.out.println("___________________________________");
		
		String [] s=new String [5];
		for (int x=0; x<s.length; x++)
		{
			System.out.println(s[x]);
		}
		System.out.println();
		s[0]="Suraj";
		s[1]="Sohel";
		s[2]="Sairaj";
		s[3]="Sai";
		s[4]="Sartaj";
		for (int s1=0; s1<s.length; s1++)
		{
			System.out.println(s[s1]);
		}
		
	}

}
