package chain_of_responsibility;

import model.Budget;

/**
 * Created by bruno on 3/20/17.
 */

public class DiscountZero implements IDiscount {
    @Override
    public double calculateDiscount(Budget budget) {
        return 0;
    }

    @Override
    public void setNext(IDiscount next) {
    }
}
