package com.javaacademy.wedding.storage;

import com.javaacademy.wedding.entity.Booking;
import jakarta.ws.rs.core.MultivaluedHashMap;
import jakarta.ws.rs.core.MultivaluedMap;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.util.MultiValueMapAdapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class BookingStorage {
    private final MultivaluedMap<Integer, Booking> data = new MultivaluedHashMap<>();

    public void save(Booking booking) {
        if (data.containsKey(booking.getMonthNumber())) {
            data.get(booking.getMonthNumber()).add(booking);
        } else {
            data.put(booking.getMonthNumber(), List.of(booking));
        }
    }

    public List<Booking> getOfMonth(int month) {
        return data.get(month);
    }
}
