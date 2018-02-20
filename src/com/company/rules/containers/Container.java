package com.company.rules.containers;

import com.company.rules.IVisitable;
import com.company.rules.IVisitor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Container implements IVisitable, Serializable {
    private List<IVisitable> visitables = new ArrayList<>();

    @Override
    public void acceptVisitor(IVisitor visitor) {
        for (IVisitable visitable : visitables) {
            visitable.acceptVisitor(visitor);
        }
    }

    @Override
    public void addVisitable(IVisitable visitable) {
        this.visitables.add(visitable);
    }
}
