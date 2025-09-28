package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import util.AppointmentStatus;

public class Scheduling {

	private static final DateTimeFormatter formatterYear = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static final DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");

	private LocalTime hour;
	private LocalDate date;
	private AppointmentStatus state;

	public Scheduling() {
	}

	public Scheduling(LocalTime hour, LocalDate date, AppointmentStatus state) {
		this.hour = hour;
		this.date = date;
		this.state = state;
	}

	public LocalTime getHour() {
		return hour;
	}

	public LocalDate getDate() {
		return date;
	}

	public AppointmentStatus getState() {
		return state;
	}

	@Override
	public String toString() {
		return "Date of consult: " + date.format(formatterYear) + "\nTime of consult: " + hour.format(formatterTime)
				+ "\nStatus of consult: " + state + "\n\n";
	}

}
