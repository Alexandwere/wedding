package com.javaacademy.wedding.controller;

import com.javaacademy.wedding.dto.BookingDto;
import com.javaacademy.wedding.dto.BookingOutDto;
import com.javaacademy.wedding.dto.CountFreeDaysDto;
import com.javaacademy.wedding.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/booking")
@RequiredArgsConstructor
@CrossOrigin
public class BookingController {
    private final BookingService bookingService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void saveBooking(@RequestBody BookingDto bookingDto) {
        bookingService.save(bookingDto);
    }

    @GetMapping("/month/{month}")
    public List<BookingOutDto> getBookingOfMonth(@PathVariable int month) {
        return bookingService.getOfMonth(month);
    }

    @GetMapping("/month/{month}/free")
    public CountFreeDaysDto getFreeDatesOfMonth(@PathVariable int month) {
        return bookingService.getCountFreeDates(month);
    }
}
