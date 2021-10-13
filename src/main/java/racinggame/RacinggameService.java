package racinggame;

import nextstep.utils.Console;

public class RacinggameService {
	public InputCarNames inputNames() {
		InputCarNames inputCarNames = new InputCarNames();
		String input;

		do {
			System.out.println("경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분)");
			input = Console.readLine();
		} while (!inputCarNames.validation(input));

		inputCarNames.setInputCarNames(input);
		return inputCarNames;
	}

	public InputNumber inputTime() {
		do {
			System.out.println("시도할 회수는 몇회인가요?");
			return new InputNumber(Console.readLine());
		} while (true);
	}

}
