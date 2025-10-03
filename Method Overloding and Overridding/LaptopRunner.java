class LaptopRunner{
	public static void main(String [] args){
		Laptop laptop=new Laptop();
		laptop.displayLaptop("Dell");
		laptop.displayLaptop("Dell", 82 );
		laptop.displayLaptop("Dell", 82, 9876543212l );
		laptop.displayLaptop("Dell", 82, 9876543212l, 15.6f );
		laptop.displayLaptop("Dell", 82, 9876543212l, 15.6f, 2.875d );
		laptop.displayLaptop("Dell", 82, 9876543212l, 15.6f, 2.875d, 'A');
		laptop.displayLaptop("Dell", 82, 9876543212l, 15.6f, 2.875d, 'A', true);
	}
}