package com.rhjensen.sample.guava.predicates;

import com.google.common.base.Predicate;
import com.rhjensen.sample.domain.Dish;

import java.util.List;

import static com.google.common.collect.Iterables.contains;
import static com.google.common.collect.Lists.newArrayList;

/**
 * Created by Richard on 4/16/2014.
 */
public class DishOfKindsPredicate implements Predicate<Dish> {
    private final List<String> dishKind;

    public DishOfKindsPredicate(String ... dishKind) {
        this.dishKind = newArrayList(dishKind);
    }

    @Override
    public boolean apply(Dish dish) {
        return contains(dishKind, dish.getKindOfDish());
    }
}
