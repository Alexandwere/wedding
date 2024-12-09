package com.javaacademy.wedding.service;

import com.javaacademy.wedding.dto.BookingDto;
import com.javaacademy.wedding.entity.Booking;
import com.javaacademy.wedding.mapper.BookingMapper;
import com.javaacademy.wedding.repository.BookingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookingService {
    BookingRepository bookingRepository;
    BookingMapper bookingMapper;

    public void save(BookingDto bookingDto) {
        Booking booking = bookingMapper.convertToBooking(bookingDto);
        booking.setBooked(true);
        bookingRepository.save(booking);
    }

    public List<BookingDto> getOfMonth(int month) {
        return bookingRepository.getOfMonth(month).stream()
                .map(bookingMapper::convertToBookingDto)
                .toList();
    }

}
