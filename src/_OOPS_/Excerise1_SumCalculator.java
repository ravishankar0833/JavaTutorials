package _OOPS_;

public class Excerise1_SumCalculator {

	private double firstNumber;
	private double secondNumber;
	
	public double getFirstNumber() {
		return firstNumber;
	}
	
	public double getSecondNumber() {
		return secondNumber;
	}
	
	public void setFirstNumber(double fNum) {
		firstNumber=fNum;
	}
	
	public void setSecondNumber(double sNum) {
		secondNumber=sNum;
	}
	
	public double getAdditionResult() {
		return firstNumber+secondNumber;
	}
	
	public double getSubtractionResult() {
		return firstNumber-secondNumber;
	}
	
	public double getMultiplicationResult() {
		return firstNumber*secondNumber;
	}
	
	public double getDivisionResult() {
		if(secondNumber!=0)
			return firstNumber/secondNumber;
		else
			return 0;
	}
}
