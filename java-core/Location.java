class Location{
	public static void main(String [] args){
		
		double london=51.507438d;
		double newYork=40.712834d;
		double paris=48.856673d;
		double tokyo=35.689567d;
		double mumbai=19.076098d;
		
		double [] place={london,newYork,paris,tokyo,mumbai};
		
		for(int lattitude=0; lattitude<=place.length; lattitude++)
			System.out.println(place[lattitude]);
		
		
	}
}