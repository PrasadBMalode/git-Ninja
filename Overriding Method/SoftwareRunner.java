class SoftwareRunner{
	public static void main(String args []){
		Antivirus antivirus=new Antivirus();
		
		antivirus.displaySoftwareName("Antivirus Software");
		antivirus.displaySoftwareReleaseYear(2025);
		antivirus.displaySoftwareKey(98765432123l);
		antivirus.displaySoftwareStorage(2.5f);
		antivirus.displaySoftwareVersion(4.756d);
		antivirus.displaySoftwareType('S');
		antivirus.displaySoftwareLicensed(true);
		
	}
}