package com.company.rules;

import com.company.rules.clickers.Button;
import com.company.rules.clickers.Slider;
import com.company.rules.containers.Container;
import com.company.rules.containers.Ifer;
import javafx.scene.web.WebEngine;

public class RuleVisitor implements IVisitor {

    private WebEngine engine;

    public RuleVisitor(){
        //this.engine = engine;
    }

    @Override
    public void visit(Button button) {
        executeClickableButton(button.getId());
    }

    @Override
    public void visit(Slider slider) {
        executeClickableSlider(slider.getId(), slider.getValue());
    }

    @Override
    public void visit(Container container) {

    }

    @Override
    public void visit(Ifer ifer) {
    }

    private void executeClickableButton(String buttonId){
        //engine.executeScript("document.getElementById('"+buttonId+"').click();");
        System.out.println("engine.executeScript(document.getElementById('"+buttonId+"').click();");
    }

    private void executeClickableSlider(String sliderId, int value){
        //engine.executeScript("document.getElementById('"+sliderId+"').getElementsByTagName('span')["+value+"].click();");
        System.out.println("document.getElementById('"+sliderId+"').getElementsByTagName('span')["+value+"].click();");
    }
}
