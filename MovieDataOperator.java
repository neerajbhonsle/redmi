class MovieDataOperator{
	static String[] MovieName={null,null,null};
	static int position=0;
	static void save(String movieName)
	{
		System.out.println("save: start");
		MovieName[position]=movieName;
		position++;
		System.out.println("saved: "+movieName+" in position :"+position);
		System.out.println("save: end");
	}
	
}