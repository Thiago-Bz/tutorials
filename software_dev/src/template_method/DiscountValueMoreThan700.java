package template_method;

import model.Budget;

/**
 * Created by bruno on 3/20/17.
 */

public class DiscountValueMoreThan700 extends DiscountTemplate {
    @Override
    public boolean maxDiscountApplicable(Budget budget) {
        return budget.getValue() > 700;
    }

    @Override
    public double getMaxDiscount(Budget budget) {
        return budget.getValue() * 0.20;
    }

    @Override
    public double getMinDiscount(Budget budget) {
        return budget.getValue() * 0.10;
    }
}