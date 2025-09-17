class MonitorRunner{
	public static void main(String [] args){
		Mouse mouse=new Mouse(3200);
		Monitor monitor=new Monitor(mouse);
		System.out.println(monitor.price);
	}
}