package com.javaacademy.wedding.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingOutDto {
    private int month;
    private int day;
    private boolean booked;
}
