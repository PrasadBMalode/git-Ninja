class ShopingOrder{
	
	public String name="Rohit";
	public int orderId=77665;
	public long transactionId=987789876678l;
	public float discount=12.5f;
	public double totalAmount=1530.45d;
	public char status='P';
	public boolean isPaid=true;
	
	public void shoping(){
		
		System.out.println(" Customer name"+ name );
		System.out.println(" order id of an customer"+ orderId );
		System.out.println("transaction id of customer "+ transactionId );
		System.out.println(" discount for customer"+ discount );
		System.out.println(" total amount"+ totalAmount );
		System.out.println(" payment pending status"+ status );
		System.out.println(" is customer paid"+ isPaid );
	}
}