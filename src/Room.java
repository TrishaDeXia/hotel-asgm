public class Room {
    private String roomType;
    private double price;
    private boolean status;
    private static int roomId = 1001;

    public Room(String roomType, double price) {
        this.roomType = roomType;
        this.price = price;
        this.status = true; 
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return status;
    }

    public void setAvailable(boolean status) {
        this.status = status;
    }

    public int getRoomId() {
        return roomId++;
    }
}
