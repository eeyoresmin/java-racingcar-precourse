package racinggame;

public class InputCarNames {
	private static final String WHITESPACE = "\\s";
	private static final String NON_WHITESPACE = "";
	private static final String COMMA = ",";
	private static final String DOUBLE_COMMA = ",,";
	private static final String ERROR_MSG = "[ERROR] 빈 이름은 허용하지 않습니다.";

	private String inputCarNames;

	public String getInputCarNames() {
		return inputCarNames;
	}

	public InputCarNames(String inputCarNames) {
		if (inputCarNames.length() == 0) {
			throw new IllegalArgumentException(ERROR_MSG);
		}

		inputCarNames = inputCarNames.replaceAll(WHITESPACE, NON_WHITESPACE);

		if (inputCarNames.endsWith(COMMA)) {
			throw new IllegalArgumentException(ERROR_MSG);
		}

		if (inputCarNames.contains(DOUBLE_COMMA)) {
			throw new IllegalArgumentException(ERROR_MSG);
		}

		this.inputCarNames = inputCarNames;
	}

	public String[] changeNameList() {
		return inputCarNames.split(COMMA);
	}
}
