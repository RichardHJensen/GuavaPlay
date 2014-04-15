package com.rhjensen.sample.guava.predicates;

import com.google.common.base.Predicate;
import com.rhjensen.sample.domain.Dish;

/**
 * Created by Richard on 4/15/2014.
 */
public class LowFatPredicate implements Predicate<Dish> {
    private double pct;

    public LowFatPredicate(double pct) {
        this.pct = pct;
    }

    @Override
    public boolean apply(Dish dish) {
        double percentage = 0.0;
        if (dish.getCalories() > 0) {
            percentage = (dish.getFatCalories() * 100.0) / dish.getCalories();
        }
        return percentage < pct;
    }
}
