package com.rhjensen.sample.guava.collections;

import com.google.common.base.Predicate;
import com.rhjensen.sample.domain.Dish;
import com.rhjensen.sample.domain.util.Menus;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Richard on 4/14/2014.
 * See the chilis-info.csv in the src/main/resources folder or the Excel spreadsheet in the project's root folder
 * for the underlying data
 */
public class FilteringTest {
    @Test
    public void shouldReturnListOfLowFatDishes() {
        // Write a filter that will find 'low-fat' items in the menu (Menus.CHILIS_MENU).
        // For this definition of 'low-fat', % of calories from fat should be < 30%
        List<Dish> lowFatItems = newArrayList(filter(Menus.CHILIS_MENU, new Predicate<Dish>() {

            @Override
            public boolean apply(Dish dish) {
                double percentage = 0.0;
                if (dish.getCalories() != 0) {
                    percentage = (dish.getFatCalories() * 100.0) / dish.getCalories();
                }
                return percentage < 30.0;
            }
        }));

        assertThat(lowFatItems.size(), is(28)); // Check the spreadsheet for the correct value
    }

    @Test
    public void shouldReturnListOfLowFatDishesBasedOnSpecifiedValue() {
        // Write a filter that will find 'low-fat' items in the menu (Menus.CHILIS_MENU).
        // For this definition of 'low-fat', % of calories from fat should be specified as a parameter
        // Run the test for 35% and 40%
    }

    @Test
    public void shouldReturnListOfLowFatDishesBasedOnSpecifiedValueWithNonZeroCalories() {
        // Some of the items in Menus.CHILIS_MENU are zero-calorie. They may not be what we mean by 'low-fat'.
        // Find the number of items with non-zero calories with % calories < 25% and < 33%
    }

    @Test
    public void shouldReturnListOfLowFatEntrees() {
        // This time let's only look at the Entrees
    }

    @Test
    public void shouldReturnListOfLowFatMainCourses() {
        // What's in a name?
        // How about including Burgers, Sandwiches, and Pizzas as well as Entrees (but not Child meals)
        // (And maybe we should go up to < 50% so we can find something to eat?)
    }
}
