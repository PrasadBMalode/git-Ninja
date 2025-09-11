class MoviesInfo{
	public boolean [] review={true,false,false,true,true};
	
	public void kfi(){
		System.out.println("1.KGF 2.Katera 3.sparsha 4.VR 5.Blink");
		
		for(int movies=0; movies<review.length; movies++){
			System.out.println(review[movies]);
		}
	}
}