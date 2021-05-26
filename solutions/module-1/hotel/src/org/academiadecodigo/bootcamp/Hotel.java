package org.academiadecodigo.bootcamp;

public class Hotel {

    public static final int NO_ROOM = -1;

    private String name;
    private Room[] rooms;

    public Hotel(String name, int numRooms) {
        this.name = name;
        rooms = new Room[numRooms];
    }

    /**
     * returns the room number if available or -1 if no more rooms are available
     */
    public int checkIn() {

        // rooms = [ r1, r2, r3]
        for (int i = 0; i < rooms.length ; i++) {

            if (rooms[i] == null) {
                rooms[i] = new Room(); // this technique is called lazy instantiation
            }

            if (rooms[i].isAvailable()) {
                rooms[i].occupy();
                return i;
            }

        }

        // there are better ways to do this in Java
        // we will learn these later on!
        return NO_ROOM;
    }

    public void checkOut(int roomId) {
        if (rooms[roomId] != null) {
            rooms[roomId].vacate();
        }
    }


    @Override
    public String toString() {
        return "Hello SmoothOOPerators!!! Hotel{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms.length +
                '}';
    }
}
