package telran.people.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.people.Company;
import telran.people.Employee;

class CompanyTest {
	Company company;
	Employee[] empl = {
			new Employee(345, "Vasya",1982,"Manager", 10000),
			new Employee(263, "Oleg",1991,"Engineer", 17000),
			new Employee(178, "Shmulik",1992,"Salesman", 13000),
			new Employee(112, "Moshe",1981,"Analitics", 12000),
			new Employee(319, "Ivan",1989,"Clerck", 11000)
		};

	@BeforeEach
	void setUp() throws Exception {
		company = new Company(empl);
	}

	@Test
	void getAllEmployeesTest() {
		Employee[] expected = {
				new Employee(112, "Moshe",1981,"Analitics", 12000),
				new Employee(178, "Shmulik",1992,"Salesman", 13000),
				new Employee(263, "Oleg",1991,"Engineer", 17000),
				new Employee(319, "Ivan",1989,"Clerck", 11000),
				new Employee(345, "Vasya",1982,"Manager", 10000)
			};
		assertArrayEquals(expected, company.getAllEmployees(Comparator.naturalOrder()));
		}

}
