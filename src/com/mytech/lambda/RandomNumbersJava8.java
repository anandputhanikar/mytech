package com.mytech.lambda;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumbersJava8 {
    public static void main(String[] args) {
        Random random = new Random();
        //random.ints().limit(10).forEach(System.out::println);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//get count of empty string
//        long count = strings.parallelStream().filter(s -> s.isEmpty()).count();
//It is very easy to switch between sequential and parallel streams.
//        System.out.println(count);


/*
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        */

        //How will you get the highest number present in a list using Java 8?
         //       Following code will print the highest number present in a list.

        List<Integer> integers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics  stat = integers.stream().mapToInt(x->x).summaryStatistics();
        //System.out.println("Highest Num :"+stat.getMax());

        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        //add 1 week to the current date

        LocalDate nextWeek = today.plus(1, ChronoUnit.DAYS);
        System.out.println("Next week: " + nextWeek);


       // How will you get next tuesday using java8?
       // Following code gets next tuesday using java8 −

//get the next tuesday
        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday on : " + nextTuesday);


       // How will you get second saturday of next month using java8?
        //        Following code gets second saturday of next month using java8 −

//get the second saturday of next month
      /*  LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);


        Instant now = currentDate.toInstant();
        ZoneId currentZone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
        System.out.println("Local date: " + localDateTime);*/
    }

}
