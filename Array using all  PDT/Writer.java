class Writer{
	
	public static void main(String [] args){
	
	String firstWriter="Prasad";
	String secondWriter="Ravi";
	String thirdWriter="Sanju";
	String fourthWriter="Manu";
	
	System.out.println("Writer list of Names");
	System.out.println("---------------------------");
	
	String [] WriterNames={firstWriter, secondWriter, thirdWriter, fourthWriter};
	
	for(int names=0; names<WriterNames.length; names++){
		System.out.println(WriterNames[names]);
	}
  
  
  int prasadId=101;
  int raviId=101;
  int sanjuId=101;
  int manuId=101;
  
  System.out.println("Writer list of ID");
	System.out.println("---------------------------");
  
  int [] WritersId={prasadId, raviId, sanjuId, manuId};
  
    for(int id=0; id<WritersId.length; id++){
	   System.out.println(WritersId[id]);
    }
	
	
	long prasadNumber=6360211265l;
	long raviNumber=8760211265l;
	long sanjuNumber=7860211265l;
	long manuNumber=9960211265l;
	
	System.out.println("Writer list of Number");
	System.out.println("---------------------------");
	
	long [] WritersNumber={prasadNumber, raviNumber, sanjuNumber,manuNumber};
	
	for(int number=0; number<WritersNumber.length; number++){
		System.out.println(WritersNumber[number]);
	}
	
	float prasadHeight=5.9f;
	float raviHeight=4.9f;
	float sanjuHeight=5.8f;
	float manuHeight=5.5f;
	
	System.out.println("Writer list of Height");
	System.out.println("---------------------------");
	
	float [] WritersHeight={prasadHeight, raviHeight, sanjuHeight, manuHeight};
	
	for(int height=0; height<WritersHeight.length; height++){
		System.out.println(WritersHeight[height]);
	}
	
	double prasadExpenditure=2000.99d;
	double raviExpenditure=3000.99d;
	double sanjuExpenditure=1000.88d;
	double manuExpenditure=2500.99d;
	
	System.out.println("Writer list of Expendeture");
	System.out.println("---------------------------");
	
	double [] WritersExpenditure={prasadExpenditure, raviExpenditure,sanjuExpenditure,  manuExpenditure};
	
	for(int Expenditure=0; Expenditure<WritersExpenditure.length; Expenditure++){
		System.out.println(WritersExpenditure[Expenditure]);
	}
	
	char prasadGrade='A';
	char raviGrade='B';
	char sanjuGrade='C';
	char manuGrade='A';
	
	System.out.println("Writer list of Grade");
	System.out.println("---------------------------");
	
	char [] WritersGrade={prasadGrade, raviGrade, sanjuGrade, manuGrade};
	
	for(int grade=0; grade<WritersGrade.length; grade++){
		System.out.println(WritersGrade[grade]);
	}
	
	boolean prasadIsWriter=true;
	boolean raviIsWriter=true;
	boolean sanjuIsWriter=true;
	boolean manuIsWriter=true;
	
	System.out.println("Writer list");
	System.out.println("---------------------------");
	
	boolean [] isWriter={prasadIsWriter, raviIsWriter, sanjuIsWriter, manuIsWriter};
	
	for(int isHe=0; isHe<isWriter.length; isHe++){
		System.out.println(isWriter[isHe]);
	}
	
 }
	
}