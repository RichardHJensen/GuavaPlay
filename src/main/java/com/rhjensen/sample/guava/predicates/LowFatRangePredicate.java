package com.rhjensen.sample.guava.predicates;

import com.google.common.base.Predicate;
import com.google.common.collect.Range;
import com.rhjensen.sample.domain.Dish;

/**
 * Created by Richard on 4/15/2014.
 */
public class LowFatRangePredicate implements Predicate<Dish> {
    private final Range<Double> valRange;

    public LowFatRangePredicate(Range<Double> valRange) {
        this.valRange = valRange;
    }

    @Override
    public boolean apply(Dish dish) {
        double percentage = 0.0;
        if (dish.getCalories() > 0) {
            percentage = (dish.getFatCalories() * 100.0) / dish.getCalories();
        }
        return valRange.contains(percentage);
    }
}
