class Room {
    public String roomFirstProperty;
    public String roomSecondProperty;

    public Room(String roomFirstProperty, String roomSecondProperty) {
        this.roomFirstProperty = roomFirstProperty;
        this.roomSecondProperty = roomSecondProperty;
    }

    public void displayRoom() {
        System.out.println("First property inside room: " + roomFirstProperty);
        System.out.println("Second property inside room: " + roomSecondProperty);
    }
}