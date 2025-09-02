class ArvindRunner{
	public static void main(String [] args){
		new Arvind();
		new Arvind("Arvind BV");
		Arvind arvindname =new Arvind("Arvind BV",102);
		Arvind arvindNumber =new Arvind("Arvind BV",103,566576455378l);
		Arvind arvindDetail =new Arvind("Arvind BV",103,566576455378l,5.8f);
		Arvind arvindDetails =new Arvind("Arvind BV",103,566576455378l,5.8f,15.00056d);
		Arvind arvindTotal =new Arvind("Arvind BV",103,566576455378l,5.8f,15.00056d,'A');
		Arvind fullDetails =new Arvind("Arvind BV",103,566576455378l,5.8f,15.00056d,'A',true);
	}
}