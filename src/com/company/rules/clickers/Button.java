package com.company.rules.clickers;

import com.company.rules.IComponent;
import com.company.rules.IVisitable;
import com.company.rules.IVisitor;
import com.company.rules.RuleVisitor;

import java.io.Serializable;

public class Button implements IComponent, IVisitable, Serializable {

    private String id;

    public Button(String id) { this.id = id; }

    public String getId() { return id; }

    public void acceptVisitor(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void addVisitable(IVisitable visitable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(IComponent IComponent) {
        throw new UnsupportedOperationException();
    }
}
