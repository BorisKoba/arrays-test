package telran.numbers;

public class CalcData {
	public CalcData(double op1, double op2, char operation) {
		super();
		this.op1 = op1;
		this.op2 = op2;
		this.operation = operation;
	}
	 
	double op1;
	double op2;
	char operation;
	public double getOp1() {
		return op1;
	}
	public void setOp1(double op1) {
		this.op1 = op1;
	}
	public double getOp2() {
		return op2;
	}
	public void setOp2(double op2) {
		this.op2 = op2;
	}
	public char getOperation() {
		return operation;
	}
	public void setOperation(char operation) {
		this.operation = operation;
	}
}
