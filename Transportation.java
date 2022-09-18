class Transportation{
	static double transport(String source,String destination)
	{
	System.out.println("start trip");
	if(source=="bengaluru"&& destination=="dandeli")
	{
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		return 300;
	}
	return 0;
	}
	static double transport(String source,String destination,double ontime){
		System.out.println("start trip");
		if(source=="bengaluru"&& destination=="dandeli"&& ontime==6){
			System.out.println("source:"+source);
			System.out.println("destination:"+destination);
			System.out.println("ontime:"+ontime);
			return 6.5;
		}
		return 0;
	}
	static boolean transport(String destination){
		System.out.println("reached destination:");
		if (destination=="dandeli"){
			System.out.println("destination:"+destination);
			return true;
		}
		return false;
	}
	static boolean transport(String destination,double ontime){
		System.out.println("reached destination & ontime:");
		if(destination=="dandeli"&& ontime==6){
			System.out.println("destination:"+destination);
			System.out.println("ontime:"+ontime);
			return true;
		}
		return false;
	}
	static boolean transport(double ontime){
		System.out.println("reached ontime:");
		if(ontime==6){
			System.out.println("ontime:"+ontime);
			return true;
		}
		return false;
	}
}