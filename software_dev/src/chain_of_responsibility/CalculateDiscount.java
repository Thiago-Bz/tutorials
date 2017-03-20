package chain_of_responsibility;

import model.Budget;

/**
 * Created by bruno on 3/20/17.
 */

public class CalculateDiscount {
    public double getDiscount(Budget budget) {
        IDiscount discount500 = new DiscountMoreThan500();
        IDiscount discountMoreThan3Items = new DiscountHasMoreThan3Items();
        IDiscount discountZero = new DiscountZero();

        discount500.setNext(discountMoreThan3Items);
        discountMoreThan3Items.setNext(discountZero);

        return discount500.calculateDiscount(budget);
    }
}