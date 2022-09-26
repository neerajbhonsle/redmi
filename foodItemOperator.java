class foodItemOperator{
	static String[] foodItem={null,null,null};
	static int position=0;
	static void save(String fooditem)
	{
		System.out.println("save:start");
		foodItem[position]=fooditem;
		position++;
		System.out.println("saved: "+fooditem+" in position :"+position);
		System.out.println("save: end");
		
	}
}