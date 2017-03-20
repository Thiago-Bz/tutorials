package template_method;

import model.Budget;

/**
 * Created by bruno on 3/20/17.
 */

public class DiscountMoreThan3Items implements IDiscountTemplate {
    @Override
    public boolean maxDiscountApplicable(Budget budget) {
        return budget.getItems().size() > 3;
    }

    @Override
    public double calculateDiscount(Budget budget) {
        if (maxDiscountApplicable(budget))
            return getMaxDiscount(budget);
        else
            return getMinDiscount(budget);
    }

    @Override
    public double getMaxDiscount(Budget budget) {
        return budget.getValue() * 0.50;
    }

    @Override
    public double getMinDiscount(Budget budget) {
        return budget.getValue() * 0.10;
    }
}