package strategy;

import model.Budget;

/**
 * Created by bruno on 3/20/17.
 */

public class ComplexTax implements ITax {
    @Override
    public double calculate(Budget budget) {
        if (budget.getValue() > 500)
            return budget.getValue() * 0.30;
        else
            return budget.getValue() * 0.10;
    }
}