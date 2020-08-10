package step03.game;

import step03.calculatescore.ScoreCalculate;
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
public class CarRacingGame {

    private List<Car> cars;

    public void racing(final List<Car> cars, final ScoreCalculate scoreCalculate) {

        for (int i = 0; i < cars.size(); i++) {

            final int randomNum = scoreCalculate.calculateScore();
            cars.get(i).AdvanceOneSpace(randomNum);

            drawScoreBard();

            this.cars = cars;
        }
    }

    public void drawScoreBard() {
        final ResultView resultView = new ResultView();

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            resultView.draw(car);
        }
        System.out.println();
    }

    public List<Car> getCars() {
        return cars;
    }

}
