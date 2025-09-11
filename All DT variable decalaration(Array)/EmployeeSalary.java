class EmployeeSalary{
	public double [] salarys={12.3456d, 34.564d, 78.764d, 67.987d, 55.986d};
	
	public void employee(){
		
		for(int amount=0; amount<salarys.length; amount++){
			System.out.println(salarys[amount]);
		}
	}
}