package org.self.thread.seatbooking;

public class Seat {
    private final int screenId;
    private final int seatId;
    private boolean isBooked;

    public Seat(int screenId, int seatId) {
        this.screenId = screenId;
        this.seatId = seatId;
        this.isBooked = false;
    }
    public String getKey() {
        return screenId + "-" + seatId; // Unique key for the seat
    }
    public boolean isBooked() {
        return isBooked;
    }
    public void setBooked(boolean booked) {
        isBooked = booked;
    }
    public int getScreenId() {
        return screenId;
    }
    public int getSeatId() {
        return seatId;
    }
}
