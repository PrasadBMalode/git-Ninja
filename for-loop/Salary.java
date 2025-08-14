class Salary{
	public static void main(String [] args){
		
		short vinay=8000;
		short sai=9000;
		short vaishu=12000;
		short prasad=30000;
		short taslim=32000;
		short hema=28000;
		
		short [] amount={vinay, sai, vaishu, prasad, taslim, hema};
		for (short price=0; price<=amount.length; price++)
			System.out.println(amount[price]);
	}
}