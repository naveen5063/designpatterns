package design_patterns.abstractfactory;

import design_patterns.abstractfactory.components.buttons.Buttons;
import design_patterns.abstractfactory.components.buttons.IosButton;

public class IosUiFactory implements UiFactory{
    @Override
    public Buttons createButton() {
        return new IosButton();
    }
}
