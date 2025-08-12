class FestivalRunner{
	public static void main(String args []){
		
		int days=Festival.festivalDays(10);
		System.out.println(days);
		
		String name=Festival.festivalName("Navaratri");
		System.out.println(name);
		
		float spending=Festival.festivalSpending(1250.2f);
		System.out.println(spending);
		
		double rating=Festival.festivalRating(9.9);
		System.out.println(rating);
		
		char grade=Festival.festivalGrade('A');
		System.out.println(grade);
		
		boolean status=Festival.festivalStatus(true);
		System.out.println(status);
		
		long crowd=Festival.festivalCrowde(23456756l);
		System.out.println(crowd);
		
	}
}