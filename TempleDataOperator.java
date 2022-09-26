class TempleDataOperator{
	static String[] TempleNames={null,null,null,null,null};
	static int position=0;
	static void save(String templeName)
	{
		System.out.println("save:start");
		TempleNames[position]=templeName;
		position++;
		System.out.println("saved: "+templeName + " in position "+position);
		System.out.println("save:end");
	}
}