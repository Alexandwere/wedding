package com.javaacademy.wedding.repository;

import com.javaacademy.wedding.entity.Booking;
import com.javaacademy.wedding.storage.BookingStorage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class BookingRepository {
    private final BookingStorage bookingStorage;

    public void save(Booking booking) {
        bookingStorage.save(booking);
    }

    public Set<Booking> getOfMonth(int month) {
        return bookingStorage.getOfMonth(month);
    }
}
