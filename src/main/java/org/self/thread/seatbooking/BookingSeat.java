package org.self.thread.seatbooking;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class BookingSeat {
    private final Map<String, ReentrantLock> seatMap;
    BookingSeat() {
        this.seatMap = new ConcurrentHashMap<>();
    }

    public boolean bookSeat(Seat seat) {
        ReentrantLock lock = getLock(seat.getKey());
        lock.lock();
        try {
            if (seat.isBooked()) {
                return false; // Seat is already booked
            }
            seat.setBooked(true); // Book the seat
//            Thread.sleep(1000);
            return true;
        } finally {
            lock.unlock();
        }
    }

    private ReentrantLock getLock(String key) {
        return seatMap.computeIfAbsent(key, k -> new ReentrantLock());
    }
}

