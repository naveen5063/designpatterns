package design_patterns.abstractfactory;

import design_patterns.abstractfactory.components.buttons.Buttons;

public interface UiFactory {

    Buttons createButton();
}
