package design_patterns.abstractfactory;

public class Flutter {

    private SupportedPlatforms platform;

    public Flutter(SupportedPlatforms platform){
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("setting theme");
    }

    public UiFactory createUiFactory(){
        return UiFactoryFactory.getUiFactoryFromPlatform(platform);
    }
}
