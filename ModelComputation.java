
public class ModelComputation {
	double operand1;
	double operand2;
	
	public ModelComputation() {
	}

	public double getOperand1() {
		return operand1;
	}

	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}

	public double getOperand2() {
		return operand2;
	}

	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}

	public ModelComputation(double a, double b) {
		operand1=a;
		operand2=b;
	}

	public double addition() {
		return operand1 + operand2;
	}

	public double subtitution() {
		return operand1 - operand2;
	}

	public double division() {

		return operand1 / operand2;
	}

	public double multiplication() {

		return operand1 * operand2;
	}
}
