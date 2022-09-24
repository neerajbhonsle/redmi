class ToothPasteRunner{
	public static void main(String[] paste)
	{
		ToothPaste.setbrand("colgate");
		String brand=getbrand();
		ToothPaste.setquantity=2;
		int quantity=ToothPaste.getquantity();
		ToothPaste.price=50;
		int price=ToothPaste.getprice();
		ToothPaste.salt(true);
		boolean salt=ToothPaste.getsalt();
		ToothPaste.safe(true);
		boolean safe=ToothPaste.getsafe();
		ToothPaste.packing(true);
		boolean packing=ToothPaste.getpacking();
		ToothPaste.taste(true);
		boolean taste=ToothPaste.gettaste();
		ToothPaste.size='M';
		char size=ToothPaste.getsize();
		
		if(salt==true)
		{
			System.out.println("toothpaste contains salt");
		}
		else{
			System.out.println("toothpaste doesnt contain salt");
		}
        if(safe==true)
		{
			System.out.println("toothpaste is safe");
		}
		else{
			System.out.println("toothpaste is not safe");
		}		
        if(packing==true)
		{
			System.out.println("toothpaste is packed properly");
		}
		else{
			System.out.println("toothpaste is poor in packing");
		}			
		if(taste==true)
		{
			System.out.println("toothpaste as good taste");
		}
		else{
			System.out.println("toothpaste is wakkk");
		}	
		if(salt==true && safe==true && packing==true && taste==true)
		{
			System.out.println("toothpaste is good to use");
		}
		else{
			System.out.println("dont buy toothpaste");
		}	

	}
}