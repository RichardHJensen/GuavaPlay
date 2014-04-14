package com.rhjensen.sample.domain.util;

import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.rhjensen.sample.domain.Dish;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;

/**
 * Created by Richard on 4/14/2014.
 */
public class DishLoader {
    private Map<String, String> columnNameMap = newHashMap();
    private final CsvToBean<Dish> csvToBean = new CsvToBean<>();
    private final HeaderColumnNameTranslateMappingStrategy<Dish> mappingStrategy = new HeaderColumnNameTranslateMappingStrategy<>();

    public DishLoader() {
        columnNameMap = defaultColumnNameMapping();
    }

    public Map<String, String> getColumnNameMap() {
        return columnNameMap;
    }

    public void setColumnNameMap(Map<String, String> columnNameMap) {
        this.columnNameMap = columnNameMap;
    }

    public List<Dish> loadFromReader(Reader reader) {
        mappingStrategy.setColumnMapping(columnNameMap);
        mappingStrategy.setType(Dish.class);

        List<Dish> dishes = csvToBean.parse(mappingStrategy, reader);
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dishes;
    }

    private Map<String, String> defaultColumnNameMapping() {
        Map<String, String> headerMap = newHashMap();
        // The default csv header line is:
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
        return headerMap;
    }
}
