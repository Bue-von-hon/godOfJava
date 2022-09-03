package strategyPattern;

import strategyPattern.strategy.RailRoadStrategy;
import strategyPattern.strategy.RoadStrategy;

public class Client {
    public static void main(String[] args) {
        Moving train = new Train();
        Moving bus = new Car();

        train.setMovingStrategy(new RailRoadStrategy());
        bus.setMovingStrategy(new RoadStrategy());

        train.move();
        bus.move();
    }
}
