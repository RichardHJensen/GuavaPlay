package com.rhjensen.sample.domain;

/**
 * Created by Richard on 4/14/2014.
 * Populated from a csv file:
 * Name,Cals,FatCals,Fat(g),Sat(g),Trans(g),Chol(mg),Sod(mg),Carbs(g),Fiber(g),Sugar(g),Prot(g),,Kind
 */
public class Dish {
    private String name;
    private int calories;
    private int caloriesFromFat;
    private float fatGrams;
    private float saturatedFatGrams;
    private float transfatGrams;
    private int cholesterolMg;
    private int sodiumMg;
    private int carbsGrams;
    private int fiberGrams;
    private int sugarGrams;
    private int proteinGrams;
    private String kindOfDish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFatCalories() {
        return caloriesFromFat;
    }

    public void setFatCalories(int caloriesFromFat) {
        this.caloriesFromFat = caloriesFromFat;
    }

    public float getFatGrams() {
        return fatGrams;
    }

    public void setFatGrams(float fatGrams) {
        this.fatGrams = fatGrams;
    }

    public float getSaturatedFatGrams() {
        return saturatedFatGrams;
    }

    public void setSaturatedFatGrams(float saturatedFatGrams) {
        this.saturatedFatGrams = saturatedFatGrams;
    }

    public float getTransfatGrams() {
        return transfatGrams;
    }

    public void setTransfatGrams(float transfatGrams) {
        this.transfatGrams = transfatGrams;
    }

    public int getCholesterolMg() {
        return cholesterolMg;
    }

    public void setCholesterolMg(int cholesterolMg) {
        this.cholesterolMg = cholesterolMg;
    }

    public int getSodiumMg() {
        return sodiumMg;
    }

    public void setSodiumMg(int sodiumMg) {
        this.sodiumMg = sodiumMg;
    }

    public int getCarbsGrams() {
        return carbsGrams;
    }

    public void setCarbsGrams(int carbsGrams) {
        this.carbsGrams = carbsGrams;
    }

    public int getFiberGrams() {
        return fiberGrams;
    }

    public void setFiberGrams(int fiberGrams) {
        this.fiberGrams = fiberGrams;
    }

    public int getSugarGrams() {
        return sugarGrams;
    }

    public void setSugarGrams(int sugarGrams) {
        this.sugarGrams = sugarGrams;
    }

    public int getProteinGrams() {
        return proteinGrams;
    }

    public void setProteinGrams(int proteinGrams) {
        this.proteinGrams = proteinGrams;
    }

    public String getKindOfDish() {
        return kindOfDish;
    }

    public void setKindOfDish(String kindOfDish) {
        this.kindOfDish = kindOfDish;
    }

    public Dish() {
    }


}
