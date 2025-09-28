class Singer{
	
	public static void main(String [] args){
	
	String firstSinger="Prasad";
	String secondSinger="Ravi";
	String thirdSinger="Sanju";
	String fourthSinger="Manu";
	
	System.out.println("Singer list of Names");
	System.out.println("---------------------------");
	
	String [] SingerNames={firstSinger, secondSinger, thirdSinger, fourthSinger};
	
	for(int names=0; names<SingerNames.length; names++){
		System.out.println(SingerNames[names]);
	}
  
  
  int prasadId=101;
  int raviId=101;
  int sanjuId=101;
  int manuId=101;
  
  System.out.println("Singer list of ID");
	System.out.println("---------------------------");
  
  int [] SingersId={prasadId, raviId, sanjuId, manuId};
  
    for(int id=0; id<SingersId.length; id++){
	   System.out.println(SingersId[id]);
    }
	
	
	long prasadNumber=6360211265l;
	long raviNumber=8760211265l;
	long sanjuNumber=7860211265l;
	long manuNumber=9960211265l;
	
	System.out.println("Singer list of Number");
	System.out.println("---------------------------");
	
	long [] SingersNumber={prasadNumber, raviNumber, sanjuNumber,manuNumber};
	
	for(int number=0; number<SingersNumber.length; number++){
		System.out.println(SingersNumber[number]);
	}
	
	float prasadHeight=5.9f;
	float raviHeight=4.9f;
	float sanjuHeight=5.8f;
	float manuHeight=5.5f;
	
	System.out.println("Singer list of Height");
	System.out.println("---------------------------");
	
	float [] SingersHeight={prasadHeight, raviHeight, sanjuHeight, manuHeight};
	
	for(int height=0; height<SingersHeight.length; height++){
		System.out.println(SingersHeight[height]);
	}
	
	double prasadExpenditure=2000.99d;
	double raviExpenditure=3000.99d;
	double sanjuExpenditure=1000.88d;
	double manuExpenditure=2500.99d;
	
	System.out.println("Singer list of Expendeture");
	System.out.println("---------------------------");
	
	double [] SingersExpenditure={prasadExpenditure, raviExpenditure,sanjuExpenditure,  manuExpenditure};
	
	for(int Expenditure=0; Expenditure<SingersExpenditure.length; Expenditure++){
		System.out.println(SingersExpenditure[Expenditure]);
	}
	
	char prasadGrade='A';
	char raviGrade='B';
	char sanjuGrade='C';
	char manuGrade='A';
	
	System.out.println("Singer list of Grade");
	System.out.println("---------------------------");
	
	char [] SingersGrade={prasadGrade, raviGrade, sanjuGrade, manuGrade};
	
	for(int grade=0; grade<SingersGrade.length; grade++){
		System.out.println(SingersGrade[grade]);
	}
	
	boolean prasadIsSinger=true;
	boolean raviIsSinger=true;
	boolean sanjuIsSinger=true;
	boolean manuIsSinger=true;
	
	System.out.println("Singer list");
	System.out.println("---------------------------");
	
	boolean [] isSinger={prasadIsSinger, raviIsSinger, sanjuIsSinger, manuIsSinger};
	
	for(int isHe=0; isHe<isSinger.length; isHe++){
		System.out.println(isSinger[isHe]);
	}
	
 }
	
}