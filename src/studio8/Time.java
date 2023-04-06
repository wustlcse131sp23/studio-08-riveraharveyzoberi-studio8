package studio8;

import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute;
	private boolean twelveHourFormat;
	
	/**
	 * Constructs instance variables
	 * @param hour Integer value from 0 to 23 indicating hour
	 * @param minute Integer value from 0 to 59 indicating minutes
	 * @param twelveHourFormat Boolean value indicating the time format
	 */

	public Time(int hour, int minute, boolean twelveHourFormat) {
		this.hour = hour;
		this.minute = minute;
		this.twelveHourFormat = twelveHourFormat;
	}
	
	@Override
	public String toString() {
		if(twelveHourFormat == true) {
			return hour % 12 + ":" + minute;
		}
		return hour + ":" + minute;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		Time test = new Time(14, 20, true);
		System.out.println(test);
    	
    }

}