class TaslimmRunner{
	public static void main(String [] args){
		new Taslimm();
		new Taslimm("Ravi Sharma");
		Taslimm Taslimm =new Taslimm("Taslimm",107);
		Taslimm taslimmaNumber =new Taslimm("Taslimm",107,9988778877l);
		Taslimm taslimmDetail =new Taslimm("Taslimm",107,9988778877l,5.4f);
		Taslimm taslimmFullDetail =new Taslimm("Taslimm",107,9988778877l,5.4f,22.6976d);
		Taslimm fullDetail =new Taslimm("Taslimm",107,9988778877l,5.4f,22.6976d,'A');
		Taslimm fullDetails =new Taslimm("Taslimm",107,9988778877l,5.4f,22.6976d,'A',true);
	}
}