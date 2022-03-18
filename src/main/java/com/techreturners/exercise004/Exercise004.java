package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exercise004 {
private LocalDateTime dateTime;
private static long amountToAdd= 1000000000l;

    public Exercise004(LocalDate date) {
        //add A gigasecond is 10^9 (1,000,000,000) seconds.
  this.dateTime= date.atStartOfDay().plus(amountToAdd, ChronoUnit.SECONDS);

    }

    public Exercise004(LocalDateTime dateTime) {
        //add A gigasecond is 10^9 (1,000,000,000) seconds.
        this.dateTime=dateTime.plus(amountToAdd,ChronoUnit.SECONDS);;
    }

    public LocalDateTime getDateTime() {
   return dateTime;
    }
}
