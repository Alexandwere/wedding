package com.javaacademy.wedding.storage;

import com.javaacademy.wedding.entity.Booking;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class BookingStorage {
    private final Set<Booking> data = new HashSet<>();

    public void save(Booking booking) {
        data.add(booking);
    }

    public List<Booking> getOfMonth(int month) {
        return data.stream().filter(booking -> booking.getMonthNumber() == month).toList();
    }
}
