package com.javaacademy.wedding.controller;

import com.javaacademy.wedding.dto.BookingDto;
import com.javaacademy.wedding.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;

    @PostMapping
    public void saveBooking(@RequestBody BookingDto bookingDto) {
        bookingService.save(bookingDto);
    }

    @GetMapping("/month/{month}")
    public void getBookingOfMonth(@PathVariable int month) {
        bookingService.getOfMonth(month);
    }
}
