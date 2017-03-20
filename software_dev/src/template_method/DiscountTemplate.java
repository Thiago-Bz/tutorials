package template_method;

import model.Budget;

/**
 * Created by bruno on 3/20/17.
 */

public abstract class DiscountTemplate {
    protected abstract boolean maxDiscountApplicable(Budget budget);

    public final double calculateDiscount(Budget budget) {
        if (maxDiscountApplicable(budget))
            return getMaxDiscount(budget);
        else
            return getMinDiscount(budget);
    }

    protected abstract double getMaxDiscount(Budget budget);

    protected abstract double getMinDiscount(Budget budget);
}
