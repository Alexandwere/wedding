package com.javaacademy.wedding.mapper;

import com.javaacademy.wedding.dto.BookingDto;
import com.javaacademy.wedding.entity.Booking;
import org.springframework.stereotype.Service;

@Service
public class BookingMapper {

    public Booking convertToBooking(BookingDto bookingDto) {
        return new Booking(bookingDto.getMonth(), bookingDto.getDay(), false);
    }

    public BookingDto convertToBookingDto(Booking booking) {
        return new BookingDto(booking.getMonthNumber(), booking.getDayNumber());
    }
}
