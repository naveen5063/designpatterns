package design_patterns.decorator;

public class OrangeCone implements IceCream{
    IceCream ic;
    public OrangeCone() {}

    public OrangeCone(IceCream ic){
        this.ic = ic;
    }

    @Override
    public int getCost() {
        if (ic != null) {
            return this.ic.getCost() + 10;
        }
        return 10;
    }

    @Override
    public String getDescription() {
        if (ic != null){
            return this.ic.getDescription() + "OrangeCone";
        }
        return "OrangeCone";
    }
}
