class switchStatement 
{
	public static void main(String[] args) 
	{
		
m2();
		System.out.println("Begin main");
	
		int z  = m1(10, 20, 30);
		System.out.println("Addition of a d c is  in main " + z);
		System.out.println("End of main");


		System.out.println("Addition of 100 200 300  is  in main " + m1(100, 200, 300));

	//	System.out.println("Addition of 100 200 300  is  in main  with float " + m1(100, 2.00, 300));
	}
	static int m1(int a, int d, int c)
	{
		
		return a-d-c;
	}

	static double m1(int a, float d, int c)
	{
		
		return a+d+c;
	}

	static void m2()
	{
		int u=10;
		System.out.println("Returns nothing");

			{
	
	System.out.println("This is block in m2");
	}
	}


}
