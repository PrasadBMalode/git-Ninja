class MobileNumber{
	public static void main(String [] args){
		
		long vaishu=8976564532l;
		long taslim=9898767545l;
		long raksha=5676879889l;
		long chaitra=988909877l;
		long kumud=56453476898l;
		long [] phNumber={vaishu,taslim,raksha,chaitra,kumud};
		System.out.println(phNumber[3]);
		mobile(phNumber);
		
	}	
		public static void mobile(long [] phNumber){
			
			for(int number=0; number<phNumber.length; number++){
				
				System.out.println(phNumber[number]);
			}
			
		
		}
		
}
	