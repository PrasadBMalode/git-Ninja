class HostelRunner{
	public static void main(String [] args){
		new Hostel();
		Hostel hostel=new Hostel("Royal Hostel");
		Hostel hostelName=new Hostel("Royal Hostel",12000);
		Hostel hostels=new Hostel("Royal Hostel",12000,87986576l);
		Hostel hostelDetails=new Hostel("Royal Hostel",12000,87986576l,8.2f);
		Hostel details=new Hostel("Royal Hostel",12000,87986576l,8.2f,12.4554d);
		Hostel detail=new Hostel("Royal Hostel",12000,87986576l,8.2f,12.4554d);
		Hostel hostelFullDetails=new Hostel("Royal Hostel",12000,87986576l,8.2f,12.4554d,'B');
	    Hostel fullDetails=new Hostel("Royal Hostel",12000,87986576l,8.2f,12.4554d,'B',true);
    }
}