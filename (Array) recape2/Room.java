class Room {
    public String roomFirstProperty;
    public String roomSecondProperty;
	public String roomThirdProperty;
	public String roomFourthProperty;
	public String roomFifthProperty;

    public Room(String roomFirstProperty, String roomSecondProperty, String roomThirdProperty,
	                 String roomFourthProperty, String roomFifthProperty) {
        this.roomFirstProperty = roomFirstProperty;
        this.roomSecondProperty = roomSecondProperty;
		this.roomThirdProperty=roomThirdProperty;
		this.roomFourthProperty=roomFourthProperty;
		this.roomFifthProperty=roomFifthProperty;
    }

    public void displayRoom() {
        System.out.println("First property inside room: " + roomFirstProperty);
        System.out.println("Second property inside room: " + roomSecondProperty);
		System.out.println("Third property inside room: " + roomThirdProperty);
		System.out.println("Fourth property inside room: " + roomFourthProperty);
		System.out.println("Fifth property inside room: " + roomFifthProperty);
		
    }
}