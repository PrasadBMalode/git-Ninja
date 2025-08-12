class CelebrityRunner{
	
	public static void main(String args []){
		
		int total=Celebrity.movieCount( 45);
		System.out.println(total);
		
		float rating=Celebrity.avgFanRating(9.9f );
		System.out.println(rating);
		
		String name=Celebrity.celebrityName("Kichha sudeepa" );
		System.out.println(name);
		
		char sex=Celebrity.Gender('M' );
		System.out.println(sex);
		
		double currency=Celebrity.netWorth( 350000000.75d);
		System.out.println(currency);
		
		boolean winner=Celebrity.award( true);
		System.out.println(winner);
		
		long mobile=Celebrity.phNumber(6360211265l );
		System.out.println(mobile);
	}
}