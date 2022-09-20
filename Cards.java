class Cards{
	
	static String type;
	static float height;
	static float width;
	static float price;
	static String[]colours;
	static void CardDetails()
	{
		System.out.println(type);
		System.out.println(height);
		System.out.println(width);
		System.out.println(price);
		if(colours!=null){
			System.out.println("colours are vaild");
			for(int position=0;position<colours.length;position++)
			{
				String ref=colours[position];
				System.out.println(ref+"position"+position);
			}
		}
		else {
			System.out.println("colour are invaild");
		}
	}
	
}