class LadiesHostelRunner{
	public static void main(String [] args){
		new LadiesHostel();
		LadiesHostel ladieshostel=new LadiesHostel("lakshmi Hostel");
		LadiesHostel ladieshostelName=new LadiesHostel("lakshmi Hostel",9000);
		LadiesHostel ladieshostels=new LadiesHostel("lakshmi Hostel",9000,879876l);
		LadiesHostel ladieshostelDetails=new LadiesHostel("lakshmi Hostel",9000,879876l,8.9f);
		LadiesHostel ladiesdetails=new LadiesHostel("lakshmi Hostel",9000,879876l,8.9f,18.4554d);
		LadiesHostel ladieshostelFullDetails=new LadiesHostel("lakshmi Hostel",9000,879876l,8.9f,18.4554d,'B');
	    LadiesHostel ladiesfullDetails=new LadiesHostel("lakshmi Hostel",9000,879876l,8.9f,18.4554d,'B',true);
    }
}
