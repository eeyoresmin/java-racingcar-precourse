package racinggame;

import java.util.regex.Pattern;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class InputCarNames {
	private final String WHITESPACE = "\\s";
	private final String NON_WHITESPACE = "";
	private final String COMMA = ",";
	private final String DOUBLE_COMMA = ",,";

	private String inputCarNames;

	public String getInputCarNames() {
		return inputCarNames;
	}

	public InputCarNames(String inputCarNames) {
		if (inputCarNames.length() == 0) {
			throw new IllegalArgumentException("빈 이름은 허용하지 않습니다.");
		}

		inputCarNames = inputCarNames.replaceAll(WHITESPACE, NON_WHITESPACE);

		if (inputCarNames.endsWith(COMMA)) {
			throw new IllegalArgumentException("빈 이름은 허용하지 않습니다.");
		}

		if (inputCarNames.contains(DOUBLE_COMMA)) {
			throw new IllegalArgumentException("빈 이름은 허용하지 않습니다.");
		}

		this.inputCarNames = inputCarNames;
	}
}
