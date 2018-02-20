package com.company.rules.containers;

import com.company.rules.IComponent;
import com.company.rules.checkers.ICheckable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ifer implements IComponent, Serializable {
    private List<IComponent> IComponents= new ArrayList<>();
    private ICheckable checker;

    public Ifer(ICheckable checker){
        this.checker = checker;
    }

    @Override
    public void add(IComponent IComponent) {
        this.IComponents.add(IComponent);
    }
}
