package com.rhjensen.sample.domain.util;

import com.rhjensen.sample.domain.Dish;

import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Richard on 4/14/2014.
 */
public class Menus {
    public static final List<Dish> CHILIS_MENU;
    static {
        DishLoader loader = new DishLoader();

        CHILIS_MENU = loader.loadFromReader(new InputStreamReader(loader.getClass().getResourceAsStream("/chilis-info.csv")));
    }

}
