class TransportationRunner{
	public static void main(String[] routes){
		String source="bengaluru";
		String destination="dandeli";
		double ontime=6;
		Transportation.transport(source,destination);
		Transportation.transport(source,destination,ontime);
		Transportation.transport(destination);
		Transportation.transport(destination,ontime);
		Transportation.transport(ontime);
	}
}