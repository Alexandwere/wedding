package com.javaacademy.wedding.storage;

import com.javaacademy.wedding.entity.Booking;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Component
public class BookingStorage {

    private final Map<Integer, Set<Booking>> data = new HashMap<>();

    public void save(Booking booking) {
        int monthNumber = booking.getMonthDay().getMonthValue();

        if (!data.containsKey(monthNumber)) {
            data.put(booking.getMonthDay().getMonthValue(), new HashSet<>(Set.of(booking)));
        } else {
            if (data.get(monthNumber).contains(booking)) {
                throw new RuntimeException("Дата уже забронирована");
            }
            data.get(monthNumber).add(booking);
        }
    }

    public Set<Booking> getOfMonth(int month) {
        if (data.containsKey(month)) {
            return data.get(month);
        }
        return Set.of();
    }
}
