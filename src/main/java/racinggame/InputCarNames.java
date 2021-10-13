package racinggame;

public class InputCarNames {
	private static final String COMMA = ",";
	private static final String MAX_SIZE_ERROR_MSG = "[ERROR] 최대 글자 수를 초과하였습니다.";
	private static final String MIN_SIZE_ERROR_MSG = "[ERROR] 최소 글자 수보다 작습니다.";
	private static final String NONE_SIZE_ERROR_MSG = "[ERROR] 빈 글자는 허용하지 않습니다.";
	private static final int MAX_SIZE = 5;
	private static final int MIN_SIZE = 1;
	private static final int NONE_SIZE = 0;

	private String inputCarNames;

	public void setInputCarNames(String inputCarNames) {
		this.inputCarNames = inputCarNames;
	}

	public String getInputCarNames() {
		return inputCarNames;
	}

	public InputCarNames() {
	}

	public InputCarNames(String inputCarNames) {
		checkInputCarNames(inputCarNames);
		this.inputCarNames = inputCarNames;
	}

	public String[] changeNameList() {
		return inputCarNames.split(COMMA);
	}

	public boolean validation(String inputValue) {
		try {
			checkInputCarNames(inputValue);
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			return false;
		}
	}

	private void checkInputCarNames(String inputValue) {
		for (String name : inputValue.split(COMMA)) {
			isAvailable(name);
		}
	}

	public boolean isAvailable(String name) {
		if (name.length() < MIN_SIZE) {
			throw new IllegalArgumentException(MIN_SIZE_ERROR_MSG);
		}

		if (name.length() > MAX_SIZE) {
			throw new IllegalArgumentException(MAX_SIZE_ERROR_MSG);
		}

		if (name.trim().length() == NONE_SIZE) {
			throw new IllegalArgumentException(NONE_SIZE_ERROR_MSG);
		}
		return true;
	}
}
