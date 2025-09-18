class CellPhoneRunner{
	public static void main(String [] args){
		SIM_Card sIM_Card=new SIM_Card("JIO",300);
		CellPhone cellPhone=new CellPhone("VIVO Y35",22000,sIM_Card);
		cellPhone.CellPhoneDisplay();
	}
}