package racinggame;

/**
 * 자동차 이름 Class
 * validation 기능과 문자열을 배열로 반환하는 기능을 포함한다.
 *
 * @author  eeyoresmin
 * @version 1.0
 */
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

	/**
	 * 현재 문자열이 이름으로 적합한지 판단한다.
	 *
	 * @param inputValue
	 * @return 유효값일 경우 true, 아니면 false
	 */
	public boolean validation(String inputValue) {
		try {
			checkInputCarNames(inputValue);
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			return false;
		}
	}

	/**
	 * 구분자로 구분하여 각 이름별로 체크한다.
	 *
	 * @param inputValue
	 */
	private void checkInputCarNames(String inputValue) {
		for (String name : inputValue.split(COMMA)) {
			isAvailable(name);
		}
	}

	/**
	 * 실제 이름으로 유효한 값인지 체크한다.
	 *
	 * @param name
	 * @return 유효할 경우 true, 아니면 예외 발생
	 */
	private boolean isAvailable(String name) {
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
