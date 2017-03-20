package template_method;

import model.Budget;

/**
 * Created by bruno on 3/20/17.
 */

public interface IDiscountTemplate {
    public boolean maxDiscountApplicable(Budget budget);
    public double calculateDiscount(Budget budget);
    public double getMaxDiscount(Budget budget);
    public double getMinDiscount(Budget budget);
}
