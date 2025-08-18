class Names{
	public static void main(String [] args){
		
		String aSection="Prasad";
		String bSection="Daya";
		String cSection="Ajay";
		String dSection="Arvind";
		String eSection="Sharath";
		
		String [] name={aSection,bSection,cSection,dSection,eSection};
		System.out.println(name[4]);
		
		studentName(name);
	}
	
	public static void studentName(String [] name){
		
		for(int school=0; school<name.length; school++ ){
			
			System.out.println(name[school]);
		}
	}
}
