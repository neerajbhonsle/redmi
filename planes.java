class planes{
 static void fly(String[]flyhigh){
		System.out.println("plane is takingoff");
		System.out.println("total planes are:"+aeroplanes.length);
		for(int index=0;index<aeroplanes.length;index++)
		{
			String ref=aeroplanes[index];
			System.out.println("aeroplanes"+ref);
		}
		System.out.println("aeroplanes landing");
	}
}