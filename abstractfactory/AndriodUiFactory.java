package design_patterns.abstractfactory;

import design_patterns.abstractfactory.components.buttons.AndriodButton;
import design_patterns.abstractfactory.components.buttons.Buttons;

public class AndriodUiFactory implements UiFactory{
    @Override
    public Buttons createButton() {
        return new AndriodButton();
    }
}
