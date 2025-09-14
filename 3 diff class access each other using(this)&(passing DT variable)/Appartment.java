class Appartment{
	public void appartmentDisplay(Flores[] flores){
		
		for(int num=0; num<flores.length; num++){
			Flores floresDetails=flores[num];
			floresDetails.FloreDisplay();
		}
		
	}
}