package com.javaacademy.wedding.mapper;

import com.javaacademy.wedding.dto.BookingDto;
import com.javaacademy.wedding.dto.BookingOutDto;
import com.javaacademy.wedding.entity.Booking;
import org.springframework.stereotype.Service;

import java.time.MonthDay;

@Service
public class BookingMapper {

    public Booking convertToBooking(BookingDto bookingDto) {
        return new Booking(MonthDay.of(bookingDto.getMonth(), bookingDto.getDay()), false);
    }

    public BookingOutDto convertToBookingOutDto(Booking booking) {
        return new BookingOutDto(booking.getMonthDay().getMonthValue(), booking.getMonthDay().getDayOfMonth(),
                booking.isBooked());
    }
}
