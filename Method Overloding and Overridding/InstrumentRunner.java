class InstrumentRunner{
	public static void main(String args []){
		Gitar gitar=new Gitar();
		
		gitar.displayInstrumentName("Giitar");
		gitar.displayInstrumentyear(2025);
		gitar.displayInstrumentSLNumber(9876543212l);
		gitar.displayInstrumentWeight(4.5f);
		gitar.displayInstrumentFrequency(440.89d);
		gitar.displayInstrumentCategory('I');
		gitar.displayInstrumentPlayable(true);
		
	}
}