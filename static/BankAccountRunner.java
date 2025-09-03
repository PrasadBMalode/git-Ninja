class BankAccountRunner{
	public static void main(String [] args){
		
		BankAccount.name="Prasad";
		BankAccount.balance=50000;
		BankAccount.accountNumber=89765435676536l;
		BankAccount.intrestRate=6.5f;
		BankAccount.overDriftLimit=250000.50d;
		BankAccount.accountStatus='A';
		BankAccount.isJoint=false;
		
		BankAccount.account();
	}
}