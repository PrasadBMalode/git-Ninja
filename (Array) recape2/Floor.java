class Floor {
    public String floorName;
    public int roomNumber;
    public Room[] rooms;

    public Floor(String floorName, int roomNumber, Room[] rooms) {
        this.floorName = floorName;
        this.roomNumber = roomNumber;
        this.rooms = rooms;
    }

    public void displayFloor() {
        System.out.println("Floor name: " + floorName);
        System.out.println("Room number: " + roomNumber);
		System.out.println("Room Details: " + rooms);
		
        displayRooms();
    }

    public void displayRooms() {
        for (Room room : rooms) {
            room.displayRoom();
        }
    }
}