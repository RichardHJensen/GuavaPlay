package com.rhjensen.sample.guava.predicates;

import com.google.common.base.Predicate;
import com.rhjensen.sample.domain.Dish;

/**
 * Created by Richard on 4/15/2014.
 */
public class DishKindPredicate implements Predicate<Dish> {
    private String kindOfDish;

    public DishKindPredicate(String kindOfDish) {
        this.kindOfDish = kindOfDish;
    }

    @Override
    public boolean apply(Dish dish) {
        return kindOfDish.equals(dish.getKindOfDish());
    }
}
