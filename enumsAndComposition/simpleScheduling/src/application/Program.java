package application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import entities.Scheduling;
import util.AppointmentStatus;

public class Program {

	public static void main(String[] args) {
		
		List<Scheduling> consults = new ArrayList<>();
		
		consults.add(new Scheduling(LocalTime.now(), LocalDate.now(), AppointmentStatus.COMPLETED));
		
		consults.add(new Scheduling(LocalTime.of(13, 00), LocalDate.of(2025, 9, 23) ,AppointmentStatus.CANCELLED));
		
		consults.add(new Scheduling(LocalTime.of(13, 00), LocalDate.of(2025, 9, 25), AppointmentStatus.SCHEDULED));
		
		for(Scheduling consult : consults) {
			System.out.print(consult);
		}
	}

}
