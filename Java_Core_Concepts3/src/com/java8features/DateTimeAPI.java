package com.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
	
	public static void LoacalDateTimeApi() {

		LocalDate date = LocalDate.now();// by using LocalDate
	    System.out.println("the current date is "+date);
	    
	    LocalTime time = LocalTime.now();// by using LoclTime
	    System.out.println("the current time is "+time);
	    
	    LocalDateTime current = LocalDateTime.now();// by using LocalDateTime
	    System.out.println("current date and time : "+current);
	    
	 // by using DateTimeFormater
	    DateTimeFormatter format =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	    String formatedDateTime = current.format(format); 
	    System.out.println("in formatted manner "+ formatedDateTime);
	    Month month = current.getMonth();//getting current month
	    int day = current.getDayOfMonth();//getting current day of the month
	    int hour = current.getHour();//getting current hour 
	    int seconds = current.getSecond();// getting  second
	    System.out.println("Month : "+month+" day : "+day+"  hours:"+hour+" seconds : "+seconds);
	    LocalDate date2 = LocalDate.of(1950,1,26);
	    System.out.println("the republic day :"+date2);
	    LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
	    System.out.println("specific date with "+ "current time : "+specificDate);
	}
	    public static void main(String[] args) 
	    {
	        LoacalDateTimeApi();
	    }


	}

