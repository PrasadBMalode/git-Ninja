class Building {
    public void displayBuilding(Floor[] floors) {
        for (Floor floor : floors) {
            floor.displayFloor();
        }
    }
}