class CardsRunner{
	public static void main(String[]play)
	{
		System.out.println("start game");
		Cards.CardDetails();
		Cards.type="aadhar card";
		Cards.height=4.41f;
		Cards.width=12.91f;
		Cards.price=0f;
		String[] colour={"orange","white","green","black"};
		Cards.colours=colour;
		Cards.CardDetails();
	}
}