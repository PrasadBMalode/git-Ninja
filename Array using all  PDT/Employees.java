class Employees{
	
	public static void main(String [] args){
	
	String firstEmployee="Prasad";
	String secondEmployee="Ravi";
	String thirdEmployee="Sanju";
	String fourthEmployee="Manu";
	
	System.out.println("Employee list of Names");
	System.out.println("---------------------------");
	
	String [] EmployeeNames={firstEmployee, secondEmployee, thirdEmployee, fourthEmployee};
	
	for(int names=0; names<EmployeeNames.length; names++){
		System.out.println(EmployeeNames[names]);
	}
  
  
  int prasadId=101;
  int raviId=101;
  int sanjuId=101;
  int manuId=101;
  
  System.out.println("Employee list of ID");
	System.out.println("---------------------------");
  
  int [] EmployeesId={prasadId, raviId, sanjuId, manuId};
  
    for(int id=0; id<EmployeesId.length; id++){
	   System.out.println(EmployeesId[id]);
    }
	
	
	long prasadNumber=6360211265l;
	long raviNumber=8760211265l;
	long sanjuNumber=7860211265l;
	long manuNumber=9960211265l;
	
	System.out.println("Employee list of Number");
	System.out.println("---------------------------");
	
	long [] EmployeesNumber={prasadNumber, raviNumber, sanjuNumber,manuNumber};
	
	for(int number=0; number<EmployeesNumber.length; number++){
		System.out.println(EmployeesNumber[number]);
	}
	
	float prasadHeight=5.9f;
	float raviHeight=4.9f;
	float sanjuHeight=5.8f;
	float manuHeight=5.5f;
	
	System.out.println("Employee list of Height");
	System.out.println("---------------------------");
	
	float [] EmployeesHeight={prasadHeight, raviHeight, sanjuHeight, manuHeight};
	
	for(int height=0; height<EmployeesHeight.length; height++){
		System.out.println(EmployeesHeight[height]);
	}
	
	double prasadExpenditure=2000.99d;
	double raviExpenditure=3000.99d;
	double sanjuExpenditure=1000.88d;
	double manuExpenditure=2500.99d;
	
	System.out.println("Employee list of Expendeture");
	System.out.println("---------------------------");
	
	double [] EmployeesExpenditure={prasadExpenditure, raviExpenditure,sanjuExpenditure,  manuExpenditure};
	
	for(int Expenditure=0; Expenditure<EmployeesExpenditure.length; Expenditure++){
		System.out.println(EmployeesExpenditure[Expenditure]);
	}
	
	char prasadGrade='A';
	char raviGrade='B';
	char sanjuGrade='C';
	char manuGrade='A';
	
	System.out.println("Employee list of Grade");
	System.out.println("---------------------------");
	
	char [] EmployeesGrade={prasadGrade, raviGrade, sanjuGrade, manuGrade};
	
	for(int grade=0; grade<EmployeesGrade.length; grade++){
		System.out.println(EmployeesGrade[grade]);
	}
	
	boolean prasadIsEmployee=true;
	boolean raviIsEmployee=true;
	boolean sanjuIsEmployee=true;
	boolean manuIsEmployee=true;
	
	System.out.println("Employee list");
	System.out.println("---------------------------");
	
	boolean [] isEmployee={prasadIsEmployee, raviIsEmployee, sanjuIsEmployee, manuIsEmployee};
	
	for(int isHe=0; isHe<isEmployee.length; isHe++){
		System.out.println(isEmployee[isHe]);
	}
	
 }
	
}