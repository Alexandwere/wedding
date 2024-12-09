package com.javaacademy.wedding.repository;

import com.javaacademy.wedding.entity.Booking;
import com.javaacademy.wedding.storage.BookingStorage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookingRepository {
    private final BookingStorage bookingStorage;

    public void save(Booking booking) {
        bookingStorage.save(booking);
    }
    public List<Booking> getOfMonth(int month) {
        return bookingStorage.getOfMonth(month);
    }
}
