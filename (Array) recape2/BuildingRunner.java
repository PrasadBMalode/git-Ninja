 class BuildingRunner {
    public static void main(String[] args) {

        Building building = new Building();
		
        Room[] roomsFloor1 = { new Room("Fan", "Light","Fridg","bedlamp","mike") };
        Room[] roomsFloor2 = { new Room("Chair", "Table","speekrs","battub","jug") };
        Room[] roomsFloor3 = { new Room("Sofa", "TV","slippers","shoes","dress") };
        Room[] roomsFloor4 = { new Room("Frames", "Fridge","bottle","pens","stickers") };
        Room[] roomsFloor5 = { new Room("DiningTable", "BedLamp","remote","shelph","box") };
		Room[] roomsFloor6 = { new Room("doll", "windo","knife","cutter","wires") };
		Room[] roomsFloor7 = { new Room("books", "doumble","Fruits","Ac","bulb") };
		Room[] roomsFloor8 = { new Room("dore", "walpaper","spects","camara","Photos") };
		Room[] roomsFloor9 = { new Room("coile", "switchs","shoeRack","socks","Keys") };
		Room[] roomsFloor10 = { new Room("ac", "heater","mackupset","charger","phone") };
		

        
        Floor firstFloor = new Floor("SSG", 101, roomsFloor1);
        Floor secondFloor = new Floor("DDG", 102, roomsFloor2);
        Floor thirdFloor = new Floor("FFG", 103, roomsFloor3);
        Floor fourthFloor = new Floor("HHG", 104, roomsFloor4);
        Floor fifthFloor = new Floor("JJG", 105, roomsFloor5);
		Floor sixthFloor = new Floor("KKG", 106, roomsFloor6);
		Floor seventhFloor = new Floor("LLG", 107, roomsFloor7);
		Floor eighthFloor = new Floor("PPG", 108, roomsFloor8);
		Floor ninthFloor = new Floor("OOG", 109, roomsFloor9);
		Floor tenthFloor = new Floor("IIG", 110, roomsFloor10);

        
        Floor[] floors = { firstFloor, secondFloor, thirdFloor, fourthFloor, fifthFloor,
		                   sixthFloor,seventhFloor, eighthFloor,ninthFloor,tenthFloor};

        
        building.displayBuilding(floors);
    }
}