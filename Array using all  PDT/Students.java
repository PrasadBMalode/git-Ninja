class Students{
	
	public static void main(String [] args){
	
	String firstStudent="Prasad";
	String secondStudent="Ravi";
	String thirdStudent="Sanju";
	String fourthStudent="Manu";
	
	System.out.println("Student list of Names");
	System.out.println("---------------------------");
	
	String [] studentNames={firstStudent, secondStudent, thirdStudent, fourthStudent};
	
	for(int names=0; names<studentNames.length; names++){
		System.out.println(studentNames[names]);
	}
  
  
  int prasadId=101;
  int raviId=101;
  int sanjuId=101;
  int manuId=101;
  
  System.out.println("Student list of ID");
	System.out.println("---------------------------");
  
  int [] studentsId={prasadId, raviId, sanjuId, manuId};
  
    for(int id=0; id<studentsId.length; id++){
	   System.out.println(studentsId[id]);
    }
	
	
	long prasadNumber=6360211265l;
	long raviNumber=8760211265l;
	long sanjuNumber=7860211265l;
	long manuNumber=9960211265l;
	
	System.out.println("Student list of Number");
	System.out.println("---------------------------");
	
	long [] studentsNumber={prasadNumber, raviNumber, sanjuNumber,manuNumber};
	
	for(int number=0; number<studentsNumber.length; number++){
		System.out.println(studentsNumber[number]);
	}
	
	float prasadHeight=5.9f;
	float raviHeight=4.9f;
	float sanjuHeight=5.8f;
	float manuHeight=5.5f;
	
	System.out.println("Student list of Height");
	System.out.println("---------------------------");
	
	float [] studentsHeight={prasadHeight, raviHeight, sanjuHeight, manuHeight};
	
	for(int height=0; height<studentsHeight.length; height++){
		System.out.println(studentsHeight[height]);
	}
	
	double prasadExpenditure=2000.99d;
	double raviExpenditure=3000.99d;
	double sanjuExpenditure=1000.88d;
	double manuExpenditure=2500.99d;
	
	System.out.println("Student list of Expendeture");
	System.out.println("---------------------------");
	
	double [] studentsExpenditure={prasadExpenditure, raviExpenditure,sanjuExpenditure,  manuExpenditure};
	
	for(int Expenditure=0; Expenditure<studentsExpenditure.length; Expenditure++){
		System.out.println(studentsExpenditure[Expenditure]);
	}
	
	char prasadGrade='A';
	char raviGrade='B';
	char sanjuGrade='C';
	char manuGrade='A';
	
	System.out.println("Student list of Grade");
	System.out.println("---------------------------");
	
	char [] studentsGrade={prasadGrade, raviGrade, sanjuGrade, manuGrade};
	
	for(int grade=0; grade<studentsGrade.length; grade++){
		System.out.println(studentsGrade[grade]);
	}
	
	boolean prasadIsStudent=true;
	boolean raviIsStudent=true;
	boolean sanjuIsStudent=true;
	boolean manuIsStudent=true;
	
	System.out.println("Student list");
	System.out.println("---------------------------");
	
	boolean [] isStudent={prasadIsStudent, raviIsStudent, sanjuIsStudent, manuIsStudent};
	
	for(int isHe=0; isHe<isStudent.length; isHe++){
		System.out.println(isStudent[isHe]);
	}
	
 }
	
}