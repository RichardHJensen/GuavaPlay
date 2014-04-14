package com.rhjensen.sample.learning;

/**
* Created by Richard on 4/14/2014.
*/
public class SomeBean {
    String aStringAttr;
    int anIntAttr;

    public String getaStringAttr() {
        return aStringAttr;
    }

    public void setaStringAttr(String aStringAttr) {
        this.aStringAttr = aStringAttr;
    }

    public int getAnIntAttr() {
        return anIntAttr;
    }

    public void setAnIntAttr(int anIntAttr) {
        this.anIntAttr = anIntAttr;
    }

    public Integer getaNullableIntAttr() {
        return aNullableIntAttr;
    }

    public void setaNullableIntAttr(Integer aNullableIntAttr) {
        this.aNullableIntAttr = aNullableIntAttr;
    }

    public float getaFloatAttr() {
        return aFloatAttr;
    }

    public void setaFloatAttr(float aFloatAttr) {
        this.aFloatAttr = aFloatAttr;
    }

    public Float getaNullableFloatAttr() {
        return aNullableFloatAttr;
    }

    public void setaNullableFloatAttr(Float aNullableFloatAttr) {
        this.aNullableFloatAttr = aNullableFloatAttr;
    }

    Integer aNullableIntAttr;
    float aFloatAttr;
    Float aNullableFloatAttr;

    public SomeBean() {
    }
}
