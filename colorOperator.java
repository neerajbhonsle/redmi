class colorOperator{
	static String[]colorName={null,null,null,null,null,null};
	static int position=0;
	static void save(String colorName){
		System.out.println("save: working");
		if(position>=colorName.length)
		{
			System.err.println("size is exceed");
			return;
		}
		if(colorName!=null && colorName.length()>5)
		{
			colorNames[position]=colorName;
			System.out.println("save colorName: "+colorName +"at position :"+position);
		}
		static void displayDetails()
		{
			for(int index=0;index<colorName.length;index++)
			{
				String ref=colorName[index];
				System.out.println(ref);
			}
		}
		static boolean findColors(String name)
		{
			System.out.println("its valid color");
			for(int index=0;index<colorName.length;index++)
			{
				String ref=colorName[index];
				if(ref==name)
				{
					System.out.println("color is :"+colorName);
					return true;
				}
				else{
					System.out.println("color is nt available");
				}
			}
			return false;
		}
	}
}