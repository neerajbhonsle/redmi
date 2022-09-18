class Office{
	static void work( String company,float salary)
	{
		System.out.println("enter to office");
		if(company=="L&T" && salary==3.5f)
		{
			System.out.println("company:"+company);
			System.out.println("salary:"+salary);
			return;
		}
		
	}
	static void work(String company,float salary,String designation)
	{
	System.out.println("entered the office");
	if(company=="L&T"&& salary==5f && designation=="team lead")
	{
	System.out.println("company:"+company);
	System.out.println("salary:"+salary);
	System.out.println("designation:"+designation);
	return;
	}
	}
}