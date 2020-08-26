package datetimesamples;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class ExampleDateTime {

	public static void main(String[] args) {

		LocalDate today=LocalDate.now();
		
		
		System.out.println(today.getDayOfMonth());
		
	//	today.
//		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		
	LocalDate birthday=LocalDate.parse("29/12/1998",format);
//		
//	//	System.out.println(startdate.getYear());
//		
//
	  System.out.println(today.isAfter(birthday));
//	 
//	//	System.out.println(enddate.isLeapYear());
//	
//		LocalDate tenthd=today.plusDays(10);
//		System.out.println(tenthd);
//		
//		Period periodage=Period.between(birthday, today);
//		
//		System.out.println(periodage.getYears());
//		
//		LocalDate afterdt=today.plusMonths(periodage.getMonths());
//		
//		
//		 LocalDate expirydate=LocalDate.of(2020,8,18);
//		 
//		 if (expirydate.isAfter(today)  || expirydate.isEqual(today))
//			 System.out.println("Valid");
//		 else
//			 System.out.println("Expired");
//		 
//		 
//		LocalDate localdt=today.withMonth(5);
//		
//		System.out.println(localdt);
//		
//		LocalDate localdy=today.plusWeeks(3).with(DayOfWeek.SUNDAY);
//		
//		System.out.println(localdy);
//		
	LocalDate startday=today.with(TemporalAdjusters.firstDayOfNextMonth());
	
//	List<string> dys
//	  today.plusDays(1)
//		LocalDate lastday=startday.with(TemporalAdjusters.lastDayOfMonth());
//		
//		
//		System.out.println(startday);
//		System.out.println(lastday);
//		
//		Period p=Period.between(startday, lastday);
//		System.out.println(p);
//		
		LocalDate firstfri=startday.with(DayOfWeek.FRIDAY);
//		
		System.out.println(firstfri);
//		

//		LocalTime ltime=LocalTime.now();
//		Instant startins=Instant.now();
//		
//		System.out.println(ltime);
//		
//		DateTimeFormatter dtformat=DateTimeFormatter.ofPattern("HH:mm:ss");
//		LocalTime lstart=LocalTime.parse("20:15:30");
//		System.out.println(lstart);
//		
//		Duration dura=Duration.between(lstart, ltime);
//		System.out.println(dura);
//		
//		System.out.println(dura.getNano());
//		
//		for(int i=10;i<600;i++) {}
//		
//		LocalTime endtime=LocalTime.now();
//		Instant endins=Instant.now();
//		
//		
//		Duration duratime=Duration.between(lstart, endtime);
//		
//		
//		System.out.println("Operation executed in " + duratime.getNano());
//		
//		
//		long gap=ChronoUnit.MILLIS.between(startins,endins);
		
		
		LocalDateTime todayall=LocalDateTime.now();
		
		DateTimeFormatter dtimeformat=DateTimeFormatter.ofPattern("yyyy/MMM/dd HH:mm");
	
		LocalDateTime local=LocalDateTime.of(2021, Month.JUNE, 10, 10, 15);
		
		LocalDateTime locafor=LocalDateTime.parse("2021/Jun/10 05:10",dtimeformat);
		
		ZoneId aust=ZoneId.of("Canada/Newfoundland");
		ZonedDateTime zone1=ZonedDateTime.of(locafor,aust);
//		
	System.out.println(zone1);
		
		
		//System.out.println(zone1.getZone());
	
//		ZoneId aust=ZoneId.of("Canada/Newfoundland");
//		
//		ZonedDateTime zone2= zone1.withZoneSameInstant(aust);
	//	System.out.println(zone2);
		
		
	}

}
