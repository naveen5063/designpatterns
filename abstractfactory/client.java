package design_patterns.abstractfactory;

import design_patterns.abstractfactory.components.buttons.Buttons;

public class client {

    public static void main(String[] args) {
        Flutter f = new Flutter(SupportedPlatforms.IOS);
        UiFactory uiFactory = f.createUiFactory();
        Buttons buttons = uiFactory.createButton();
        buttons.changesize();

    }



}
