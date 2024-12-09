package com.javaacademy.wedding.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Booking {
    private int monthNumber;
    private int dayNumber;
    boolean booked;

}
