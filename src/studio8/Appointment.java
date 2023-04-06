package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Appointment {
	
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	

	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + "]";
	}



	public static void main(String[] args) {
		Date date1 = new Date(1, 1, 2023);
		Time time1 = new Time(14, 20, true);
		Date date2 = new Date(1, 2, 2023);
		Time time2 = new Time(14, 20, true);
		Appointment appointment1 = new Appointment(date1, time1);
		Appointment appointment2 = new Appointment(date2, time2);
		HashSet<Appointment> calendar = new HashSet<>(); 
		calendar.add(appointment1);
		calendar.add(appointment2);	
		System.out.println(calendar);
	}

}
