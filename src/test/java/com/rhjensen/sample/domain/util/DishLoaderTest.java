package com.rhjensen.sample.domain.util;

import com.rhjensen.sample.domain.Dish;
import org.junit.Test;

import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Richard on 4/14/2014.
 */
public class DishLoaderTest {
    @Test
    public void shouldLoadDishDataFromSpecifiedFileWithDefaultMapping() {
        DishLoader loader = new DishLoader();
        List<Dish> dishes = loader.loadFromReader(new InputStreamReader(this.getClass().getResourceAsStream("/snippet.csv")));

        // These are the same assertions from OpenCSVLearningTest.shouldReadCsvFileIntoListOfBeansUsingCustomHeaderMapping()
        assertThat(dishes.size(), is(4));
        assertThat(dishes.get(3).getName(), is("Bottomless Tostada Chips"));
        assertThat(dishes.get(0).getKindOfDish(), is("Dessert"));
    }

    @Test
    public void shouldLoadDishDataFromSpecifiedFileWithCustomMapping() {
        // The csv header line is:
        // Name,Calories,Calories from fat,Fat,Saturated fat,Transfats,Cholesterol,Sodium,Carbs,Fiber,Sugars,Protein,,Category
        Map<String, String> headerMap = newHashMap();
        headerMap.put("Name", "name");
        headerMap.put("Calories", "calories");
        headerMap.put("Calories from fat", "caloriesFromFat");
        headerMap.put("Fat", "fatGrams");
        headerMap.put("Saturated fat", "saturatedFatGrams");
        headerMap.put("Transfats)", "transfatGrams");
        headerMap.put("Cholesterol)", "cholesterolMg");
        headerMap.put("Sodium", "sodiumMg");
        headerMap.put("Carbs", "carbsGrams");
        headerMap.put("Fiber", "fiberGrams");
        headerMap.put("Sugars", "sugarGrams");
        headerMap.put("Protein", "proteinGrams");
        headerMap.put("Category", "kindOfDish");

        DishLoader loader = new DishLoader();
        loader.setColumnNameMap(headerMap);
        List<Dish> dishes = loader.loadFromReader(new InputStreamReader(this.getClass().getResourceAsStream("/another-snippet.csv")));

        // Same data as snippet.csv but different headers
        assertThat(dishes.size(), is(4));
        assertThat(dishes.get(3).getName(), is("Bottomless Tostada Chips"));
        assertThat(dishes.get(0).getKindOfDish(), is("Dessert"));
    }
}
