package racinggame;

import nextstep.utils.Console;

public class RacinggameService {
	/**
	 * 유효한 이름 값이 입력될 때까지 반복 입력 받으며,
	 * 최종 이름값을 InputCarName 객체로 반환한다.
	 *
	 * @return InputCarName
	 */
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

	/**
	 * 숫자만 입력을 허용한다.
	 *
	 * @return InputNumber
	 */
	public MoveTime inputMoveTime() {
		do {
			System.out.println("시도할 회수는 몇회인가요?");
			return new MoveTime(Console.readLine());
		} while (true);
	}

	public void playGame(Cars cars, MoveTime moveTime) {
		System.out.println("실행 결과");
		for (int i = 0; i < moveTime.getMoveTime(); i++) {
			cars.play();
		}
	}

	public void showResult(Cars cars) {
		ResultGame resultGame = new ResultGame(cars);
		System.out.println(resultGame.displayResult());
	}
}
