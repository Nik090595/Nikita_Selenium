package com.selemnium_practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStamp {

	public static String TimeDate() {
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime current = LocalDateTime.now();
		String Time = d.format(current);
	    return Time;
	}
	
	public static void main(String[] args) {
		String Time1 = TimeStamp.TimeDate();
		System.out.println(Time1);
	}
}
