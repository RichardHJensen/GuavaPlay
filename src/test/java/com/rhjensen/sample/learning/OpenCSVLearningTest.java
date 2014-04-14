package com.rhjensen.sample.learning;

import au.com.bytecode.opencsv.CSVParser;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameMappingStrategy;
import au.com.bytecode.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.rhjensen.sample.domain.Dish;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Richard on 4/14/2014.
 */
public class OpenCSVLearningTest {
    CSVParser parser;
    CSVReader reader;
    CsvToBean<SomeBean> csvBean;

    @Test
    public void shouldReadCsvFileIntoListOfSringArrays() throws IOException {
        CSVReader reader = new CSVReader(new InputStreamReader(this.getClass().getResourceAsStream("/snippet.csv")));

        List<String[]> lines = reader.readAll();

        // We should have 5 lines (the first is the header).
        // Each line should have 14 elements (the last being 'Kind')
        assertThat(lines.size(), is(5));
        assertThat(lines.get(0).length, is(14));
        assertThat(lines.get(4)[0], is("Bottomless Tostada Chips"));
        assertThat(lines.get(1)[13], is("Dessert"));
        reader.close();
    }

    @Test
    public void shouldReadCsvFileIntoListOfBeans() {
        CsvToBean<SomeBean> csvToBean = new CsvToBean<>();
        // Simple bean where csv header line matches the getter/setter bean names
        HeaderColumnNameMappingStrategy<SomeBean> strategy = new HeaderColumnNameMappingStrategy<>();
        strategy.setType(SomeBean.class);
        List<SomeBean> beanList = csvToBean.parse(strategy, new InputStreamReader(this.getClass().getResourceAsStream("/bean-sample.csv")));
        assertNotNull(beanList);
        // There are four lines in the file, but the first is the header row
        assertThat(beanList.size(), is(3));
        assertThat(beanList.get(0).getaStringAttr(), equalTo("Some String In Quotes"));
        assertThat(beanList.get(1).getaStringAttr(), equalTo("A string not in quotes"));
        assertThat(beanList.get(2).getaStringAttr(), equalTo("'Can I use single quotes?'"));
    }

    @Test
    public void shouldReadCsvFileIntoListOfBeansUsingCustomHeaderMapping() {
        CsvToBean<Dish> csvToBean = new CsvToBean<>();
        HeaderColumnNameTranslateMappingStrategy<Dish> strategy = new HeaderColumnNameTranslateMappingStrategy<>();
        Map<String, String> headerMap = newHashMap();
        // The csv header line is:
        // Name,Cals,FatCals,Fat(g),Sat(g),Trans(g),Chol(mg),Sod(mg),Carbs(g),Fiber(g),Sugar(g),Prot(g),,Kind
        headerMap.put("Name", "name");
        headerMap.put("Cals", "calories");
        headerMap.put("FatCals", "fatCalories");
        headerMap.put("Fat(g)", "fatGrams");
        headerMap.put("Sat(g)", "saturatedFatGrams");
        headerMap.put("Trans(g)", "transfatGrams");
        headerMap.put("Chol(mg)", "cholesterolMg");
        headerMap.put("Sod(mg)", "sodiumMg");
        headerMap.put("Carbs(g)", "carbsGrams");
        headerMap.put("Fiber(g)", "fiberGrams");
        headerMap.put("Sugar(g)", "sugarGrams");
        headerMap.put("Prot(g)", "proteinGrams");
        headerMap.put("Kind", "kindOfDish");

        strategy.setColumnMapping(headerMap);
        strategy.setType(Dish.class);

        List<Dish> dishes = csvToBean.parse(strategy, new InputStreamReader(this.getClass().getResourceAsStream("/snippet.csv")));
        assertThat(dishes.size(), is(4));
        assertThat(dishes.get(3).getName(), is("Bottomless Tostada Chips"));
        assertThat(dishes.get(0).getKindOfDish(), is("Dessert"));
        assertThat(dishes.get(2).getCalories(), is(1050));
        assertThat(dishes.get(2).getFatCalories(), is(600));
    }
}
