package com.company.rules;

import java.io.Serializable;
import java.util.List;

public class Rules implements Serializable{
    private List components;
    public Rules(){}

    public List getComponents(){return components;}

    public void setComponents(List components){this.components = components;}
}
