package strategy;

/**
 * Created by bruno on 3/20/17.
 */

public class SimpleTax implements ITax {
    @Override
    public double calculate(Budget budget) {
        return budget.getValue() * 0.10;
    }
}