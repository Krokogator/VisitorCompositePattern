package com.company.rules;

public interface IVisitable {
    void acceptVisitor(IVisitor visitor);
    void addVisitable(IVisitable visitable);
}
