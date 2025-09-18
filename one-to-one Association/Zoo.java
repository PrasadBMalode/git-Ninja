class Zoo{
	public String zooName;
	public int zooTicketPrice;
	public Animals animals;
	
	public Zoo(String zooName,int zooTicketPrice,Animals animals){
		this.zooName=zooName;
		this.zooTicketPrice=zooTicketPrice;
		this.animals=animals;
	}
	
	public void zooDisplay(){
		System.out.println(zooName);
		System.out.println(zooTicketPrice);
		
		System.out.println(animals.animalsCount);
		System.out.println(animals.allAreWildeAnimals);
	}
}