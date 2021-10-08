package racinggame;

public class CarName {
	private static final int MAX_SIZE = 5;

	private String name;

	public String getName() {
		return name;
	}

	public CarName(String name) {
		if (name == null) {
			throw new NullPointerException("NPE");
		}
		if (name.length() >= MAX_SIZE) {
			throw new IllegalArgumentException("이름은 5글자 이하이이어야 합니다.");
		}

		this.name = name;
	}
}
