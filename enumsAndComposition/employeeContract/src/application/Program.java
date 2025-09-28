package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Contract;
import util.ContractType;

public class Program {

	public static void main(String[] args) {
		List<Contract> listOfContracts = new ArrayList<>();

		listOfContracts.add(new Contract("Luiz Gustavo", LocalDate.of(2023, 1, 10), LocalDate.of(2025, 1, 10), ContractType.CLT));

		listOfContracts.add(new Contract("Carlos Eduardo", LocalDate.of(2024, 6, 1), LocalDate.of(2026, 6, 1), ContractType.PJ));

		listOfContracts.add(new Contract("Paçoca Amendoim", LocalDate.of(2024, 9, 1), LocalDate.of(2025, 8, 25), ContractType.INTERN));

		for(Contract contract : listOfContracts) {
			System.out.println(contract);
		}
	}

}
