package telran.people;

import java.util.Arrays;
import java.util.Comparator;

public class Company {
	private Employee[] employee;

	public Employee[] getAllEmployees(Comparator<Employee> comp) {
		Employee[] res = Arrays.copyOf(employee, employee.length);
		sortById(res);
		return res;
	}

	public void sortById(Employee[] empl) {
		Employee temp;
		for (int i = 0; i < empl.length; i++) {
			for (int j = 0; j < empl.length - 1 - i; j++) {
				if (empl[j].getId() > empl[j + 1].getId()) {
					temp = empl[j];
					empl[j] = empl[j + 1];
					empl[j + 1] = temp;

				}
			}
		}
	}

//	public Employee[] getEmployeesByAge(Employee[] empl) {
//
//	}

	public Company(Employee[] employee) {
		this.employee = Arrays.copyOf(employee, employee.length);

	}
}
