package design_patterns.decorator;

public class StrawberyScoop implements IceCream{
    IceCream ic;

    public StrawberyScoop(IceCream ic) {
        this.ic = ic;
    }


    @Override
    public int getCost() {
        if (ic != null) {
            return this.ic.getCost() + 5;
        }
        return 5;
    }

    @Override
    public String getDescription() {
        if (ic != null){
            return this.ic.getDescription() + "StrawberyScoop";
        }
        return "StrawberyScoop";
    }
}
