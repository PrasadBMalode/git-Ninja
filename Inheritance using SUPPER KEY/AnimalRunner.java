class AnimalRunner{
	public static void main(String [] args){
		
		new Dog();
		
		Dog dog=new Dog("Bruno", 1001, 9876543212l, 2.5f, 15.60d, 'M', true);
		dog.dogDisplay();
	}
}