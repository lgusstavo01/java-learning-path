package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Contract;
import entities.EmployeeContract;
import entities.InternShip;
import util.Position;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Contract> contracts = new ArrayList<>();

		contracts.add(new EmployeeContract(LocalDate.of(2024, 1, 1), LocalDate.of(2025, 1, 1), 4500.0, Position.PLENO));

		contracts.add(new EmployeeContract(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31), 3000.0, Position.JUNIOR));

		contracts.add(new InternShip(LocalDate.of(2024, 2, 1), LocalDate.of(2027, 8, 1), 1500.0, "João Silva"));

		for (Contract c : contracts) {
			System.out.println("----------------------------");
			System.out.println(c.toString());
		}
	}
}
