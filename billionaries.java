class billionaries{
	static String[] names={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	static void save (String name)
	{
		System.out.println(" list of  billionaries are: ");
		if(position>=names.length)
		{
			System.err.println("Size exceeded");
			return;
		}
		
		if (names!=null && name!=null)
		{
			System.out.println("person name is nt valid");
			names[position]=name;
			position++;
			System.out.println("billionaries name is: " +names+" at position "+position);
		}
	}
	static void displaydetails()
	{
		for (int money=0;money<names.length;money++)
		{
			String ref=names[money];
			System.out.println(ref);
		}
	}
	static boolean findbillionaries(String it)
	{
		System.out.println("name is valid");
		for (int money=0;money<names.length;money++)
		{
			
			String ref=names[money];
			if(ref==it)
			{
				System.out.println("name is:"+ref);
				return true;
			}
			else{
				System.out.println("name is nt valid");
				
			}
		}
		return false;
	}
	static String update(String oldname,String newname)
	{
		System.out.println("updating");
		if (oldname!=null && newname!=null)
		{
			
			System.out.println("name is valid");
			 for (int money=0; money<names.length;money++)
			 {
				 String dollar=names[money];
				 if (oldname==dollar)
				 {
					 System.out.println("billionaries updated"+dollar +"with ");
					 names[money]=newname;
					 return newname;
				 }
			 }
		}
		else{
			System.out.println("name entered is invalid");
		}
		return null;
	}
	
}