class ConstructorChaining{
	
	public ConstructorChaining(){
		this(200);
	}
	public ConstructorChaining(int price){
		this(200,'A');
	}
	public ConstructorChaining(int price, char grade){
		System.out.println(price);
		System.out.println(grade);
		
	}
	}

