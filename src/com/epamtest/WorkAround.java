package com.epamtest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WorkAround {
    public static void main(String[] args) {
        String dateTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        System.out.println(dateTime);
    }
}
