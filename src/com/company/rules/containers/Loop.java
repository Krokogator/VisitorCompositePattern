package com.company.rules.containers;

import com.company.rules.IComponent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Loop implements IComponent, Serializable {
    private List<IComponent> IComponents = new ArrayList<>();
    private int loops;

    public Loop(int loops){
        this.loops = loops;
    }

    @Override
    public void add(IComponent IComponent) {
        this.IComponents.add(IComponent);
    }
}
