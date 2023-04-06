package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Date {

	private int month;
	private int day;
	private int year;

	/**
	 * Constructs instance variables
	 * @param month Integer value from 1 to 12 indicating the month
	 * @param day Integer value from 1 to 31 indicating the day
	 * @param year Positive integer values indicating the year
	 */
	
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public boolean Holiday() {
		if(this.day == 1 && this.month == 1) {
			return true;
		}
		if(this.day == 4 && this.month == 7) {
			return true;
		}
		return false;
		
	}
	
	
	
    @Override
	public String toString() {
    	if(Holiday() == true) {
    		return month + "/" + day + "/" + year + " this date is a holiday.";
    	}
		return month + "/" + day + "/" + year;
	}

	public static void main(String[] args) {
		Date newYear = new Date(1, 1, 2023);
		Date yesterday = new Date(4, 5, 2023);
		Date today = new Date(4, 6, 2023);
		Date tommorow = new Date(4, 7, 2023);
		Date independenceDay = new Date(4, 7, 2023);
		HashSet<Date> set = new HashSet<Date>();
		set.add(newYear);
		set.add(yesterday);
		set.add(today);
		set.add(tommorow);
		set.add(newYear);
    	System.out.println(set);
    }

}
