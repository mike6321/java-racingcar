package step03.game;

import step03.calculatescore.CalculatorRandomScore;
import step03.calculatescore.ResultCalculate;
import step03.calculatescore.ScoreCalculate;
import step03.calculatescore.WinnerCalculate;
import step03.car.Car;
import step03.view.ResultView;

import java.util.List;

/**
 * Project : java-racingcar
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:02 오후
 */
public class CarRacingGame extends AbstCarRacingGame{

    private List<Car> cars;
    public List<Car> getCars() {
        return cars;
    }
    private final ResultView resultView = new ResultView();

    @Override
    public void gameStart(List<Car> cars, ScoreCalculate scoreCalculate) {
        for (int i = 0; i < cars.size(); i++) {
            final int randomNum = scoreCalculate.calculateScore();
            cars.get(i).advanceOneSpace(randomNum);
            this.cars = cars;
        }
        drawScoreBoard();
    }

    public void drawWinnerBoard() {
        resultView.getWinnerScore(cars, new WinnerCalculate());
    }

    public void drawScoreBoard() {
        resultView.draw(cars);
        System.out.println();
    }

}
