class HospitalPatient{
	public HospitalPatient(){
		System.out.println("its default constructor");
		
	}
	public HospitalPatient(String name, int bill_amount, long patient_id, float body_temparature,double sugar_level, char gender, boolean is_admited){
		System.out.println(name);
		System.out.println(bill_amount);
		System.out.println(patient_id);
		System.out.println(body_temparature);
		System.out.println(sugar_level);
		System.out.println(gender);
		System.out.println(is_admited);
		
	}
	
}