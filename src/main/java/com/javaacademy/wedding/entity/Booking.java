package com.javaacademy.wedding.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.MonthDay;

@Data
@AllArgsConstructor
public class Booking {
    private MonthDay monthDay;
    private boolean booked;
}
