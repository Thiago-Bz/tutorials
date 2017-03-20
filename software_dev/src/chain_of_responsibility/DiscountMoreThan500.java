package chain_of_responsibility;

import model.Budget;

/**
 * Created by bruno on 3/20/17.
 */

public class DiscountMoreThan500 implements IDiscount {
    private IDiscount next;

    @Override
    public double calculateDiscount(Budget budget) {
        if (budget.getValue() > 500)
            return budget.getValue() * 0.20;
        else
            return next.calculateDiscount(budget);
    }

    @Override
    public void setNext(IDiscount next) {
        this.next = next;
    }
}