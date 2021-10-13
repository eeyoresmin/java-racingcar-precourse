package racinggame;

public class InputNumber {
	private int inputNumber;

	public InputNumber(String inputNumber) {
		validation(inputNumber);
		this.inputNumber = Integer.parseInt(inputNumber);
	}

	public int getInputNumber() {
		return inputNumber;
	}

	public boolean validation(String inputValue) {
		try {
			Integer.parseInt(inputValue);
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			return false;
		}
	}
}
