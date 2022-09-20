class Bicycle{
	static String[]names;
	static String[]color;
	static String[]companynames;
	static byte[]durability;
	static double[] width;
	static double [] height;
	static double [] weight;
	static short [] rimsize;
	static long [] price;
	static int [] speed;
	static String [] material;
	static String [] modelnames;
	static char size;
	static String strength;
	static boolean comfort;
	static String stiffness;
	static String type;
	
	static void bicycleproperties()
	{
		System.out.println(names);
		if(colours!=null){
			System.out.println("size are vaild");
			for(int position=0;position<size.length;position++)
			{
				String ref=sizes[position];
				System.out.println(ref+"position"+position);
			}
		}
		else {
			System.out.println("size are invaild");
		}
		System.out.println(color);
		if(colours!=null){
			System.out.println("color are vaild");
			for(int position=0;position<color.length;position++)
			{
				String ref=colours[position];
				System.out.println(ref+"position"+position);
			}
		}
		else {
			System.out.println("color are invaild");
		}
	}
}