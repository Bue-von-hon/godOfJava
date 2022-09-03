package strategyPattern;

import strategyPattern.strategy.MovableStrategy;

public class Moving {
    private MovableStrategy movableStrategy;

    public void setMovingStrategy(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }

    public void move() {
        movableStrategy.move();
    }
}
