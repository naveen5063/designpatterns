package design_patterns.decorator;

public class VanillaScoop implements IceCream{
    IceCream ic;

    public VanillaScoop(IceCream ic) {
        this.ic = ic;
    }


    @Override
    public int getCost() {
        if (ic != null) {
            return this.ic.getCost() + 8;
        }
        return 8;
    }

    @Override
    public String getDescription() {
        if (ic != null){
            return this.ic.getDescription() + "VanillaScoop";
        }
        return "VanillaScoop";
    }
}
