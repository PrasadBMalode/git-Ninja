class SmartWalletRunner{
	public static void main(String args []){
		
		SmartWallet mony=new SmartWallet();
		mony.addMony();
		
		SmartWallet payment=new SmartWallet();
		payment.makePayment();
		
		SmartWallet  balance=new SmartWallet();
		balance.checkBalance();
		
		SmartWallet  report=new SmartWallet();
		report.generateReport();
		
		SmartWallet  wallet=new SmartWallet();
		wallet.secureWallet();
	}
}