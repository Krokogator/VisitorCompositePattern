package com.company.rules;

import com.company.rules.clickers.Button;
import com.company.rules.clickers.Slider;
import com.company.rules.containers.Container;
import com.company.rules.containers.Ifer;

public interface IVisitor {
    void visit(Button button);
    void visit(Slider slider);
    void visit(Container container);
    void visit(Ifer ifer);
}
