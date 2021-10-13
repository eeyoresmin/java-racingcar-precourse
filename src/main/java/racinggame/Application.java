package racinggame;

public class Application {
    private static RacinggameService racinggameService = new RacinggameService();

    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        Cars cars = new Cars(racinggameService.inputNames());

        racinggameService.playGame(cars, racinggameService.inputMoveTime());

        racinggameService.showResult(cars);
    }
}
