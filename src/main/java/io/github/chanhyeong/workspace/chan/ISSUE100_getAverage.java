package io.github.chanhyeong.workspace.chan;

import io.github.chanhyeong.common.BaseExecutor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ISSUE100_getAverage implements BaseExecutor {
	@Override
	public void execute() {
		Employee employee = new Employee();
		employee.setName("테스트");
		employee.setIncome(10000000L);

		System.out.println(employee.getName());
		System.out.println("Employee with lombok");
	}

	@Getter
	@Setter
	@ToString
	private class Employee {
		private String name;
		private long income;
	}
}
