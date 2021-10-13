package racinggame;

import java.util.regex.Pattern;

import nextstep.utils.Console;

public class Application {
    private static RacinggameService racinggameService = new RacinggameService();

    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        Cars cars = new Cars(racinggameService.inputNames());

        InputNumber inputNumber = racinggameService.inputTime();

        System.out.println("실행 결과");
        for (int i = 0; i <inputNumber.getInputNumber() ; i++) {
            cars.play();
        }

        ResultGame resultGame = new ResultGame(cars);
        resultGame.aggregateWinners();
        System.out.println(resultGame.displayResult());
    }
}
