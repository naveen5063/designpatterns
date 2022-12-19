package design_patterns.abstractfactory;

public class UiFactoryFactory {

    public static UiFactory getUiFactoryFromPlatform(SupportedPlatforms platform){
        return switch (platform){
            case IOS -> new IosUiFactory();
            case ANDROID -> new AndriodUiFactory();
        };
    }
}
