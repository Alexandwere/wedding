package com.javaacademy.wedding.service;

import com.javaacademy.wedding.dto.BookingDto;
import com.javaacademy.wedding.dto.BookingOutDto;
import com.javaacademy.wedding.dto.CountFreeDaysDto;
import com.javaacademy.wedding.entity.Booking;
import com.javaacademy.wedding.mapper.BookingMapper;
import com.javaacademy.wedding.repository.BookingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    public void save(BookingDto bookingDto) {
        Booking booking = bookingMapper.convertToBooking(bookingDto);
        booking.setBooked(true);
        bookingRepository.save(booking);
    }

    public List<BookingOutDto> getOfMonth(int month) {
        return bookingRepository.getOfMonth(month).stream()
                .map(bookingMapper::convertToBookingOutDto)
                .toList();
    }

    public CountFreeDaysDto getCountFreeDates(int month) {
        CountFreeDaysDto countFreeDays = new CountFreeDaysDto();
        countFreeDays.setCount(bookingRepository.getOfMonth(month).size());
        return countFreeDays;
    }
}
