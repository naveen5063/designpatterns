package design_patterns.decorator;

public class ChocolateCone implements IceCream{
    IceCream ic;
    public ChocolateCone() {}

    public ChocolateCone(IceCream ic){
        this.ic = ic;
    }

    @Override
    public int getCost() {
        if (ic != null) {
            return this.ic.getCost() + 15;
        }
        return 15;
    }

    @Override
    public String getDescription() {
        if (ic != null){
            return this.ic.getDescription() + "ChocolateCone";
        }
        return "ChocolateCone";
    }
}
