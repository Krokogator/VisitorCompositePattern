package com.company;

import com.company.rules.IComponent;
import com.company.rules.IVisitable;
import com.company.rules.RuleVisitor;
import com.company.rules.Rules;
import com.company.rules.checkers.Value;
import com.company.rules.clickers.Button;
import com.company.rules.clickers.Slider;
import com.company.rules.containers.Container;
import com.company.rules.containers.Ifer;
import com.company.rules.containers.Loop;
import com.company.serializable.DeserializeFromXML;
import com.company.serializable.SerializeToXML;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        IVisitable rule = new Container();
        rule.addVisitable(new Button("feedButton"));
        rule.addVisitable(new Slider("hayButton", 8));


        List components = new ArrayList();
        components.add(rule);

        Rules rules = new Rules();
        rules.setComponents(components);

        SerializeToXML.serialize(rules, "testout");

        Rules deserialised = (Rules) DeserializeFromXML.deserialize("testout");

        RuleVisitor visitor = new RuleVisitor();


        for (IVisitable kompot:(List<IVisitable>)deserialised.getComponents()) {
            System.out.println("DESERIALISED");
            kompot.acceptVisitor(visitor);
        }



    }
}
