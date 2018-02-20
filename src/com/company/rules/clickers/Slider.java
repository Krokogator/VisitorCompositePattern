package com.company.rules.clickers;

import com.company.rules.IComponent;
import com.company.rules.IVisitable;
import com.company.rules.IVisitor;

import java.io.Serializable;

public class Slider implements IComponent , IVisitable, Serializable{

    private String sliderId;
    private int value;

    public Slider(String sliderId, int value){
        this.sliderId = sliderId;
        this.value = value;
    }

    public String getId(){return sliderId;}
    public int getValue(){return value;}


    @Override
    public void add(IComponent IComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void addVisitable(IVisitable visitable) {
        throw new UnsupportedOperationException();
    }
}
