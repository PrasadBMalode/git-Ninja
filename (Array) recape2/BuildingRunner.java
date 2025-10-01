 class BuildingRunner {
    public static void main(String[] args) {

        Building building = new Building();
		
        Room[] roomsFloor1 = { new Room("Fan", "Light") };
        Room[] roomsFloor2 = { new Room("Chair", "Table") };
        Room[] roomsFloor3 = { new Room("Sofa", "TV") };
        Room[] roomsFloor4 = { new Room("Frames", "Fridge") };
        Room[] roomsFloor5 = { new Room("DiningTable", "BedLamp") };

        
        Floor firstFloor = new Floor("SSG", 101, roomsFloor1);
        Floor secondFloor = new Floor("DDG", 102, roomsFloor2);
        Floor thirdFloor = new Floor("FFG", 103, roomsFloor3);
        Floor fourthFloor = new Floor("HHG", 104, roomsFloor4);
        Floor fifthFloor = new Floor("JJG", 105, roomsFloor5);

        
        Floor[] floors = { firstFloor, secondFloor, thirdFloor, fourthFloor, fifthFloor };

        
        building.displayBuilding(floors);
    }
}