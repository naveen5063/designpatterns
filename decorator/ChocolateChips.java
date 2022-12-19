package design_patterns.decorator;

public class ChocolateChips implements IceCream{
    IceCream ic;

    public ChocolateChips(IceCream ic) {
        this.ic = ic;
    }


    @Override
    public int getCost() {
        if (ic != null) {
            return this.ic.getCost() + 2;
        }
        return 2;
    }

    @Override
    public String getDescription() {
        if (ic != null){
            return this.ic.getDescription() + "ChocolateChips";
        }
        return "ChocolateChips";
    }
}
