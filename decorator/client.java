package design_patterns.decorator;

public class client {
    public static void main(String[] args) {
        IceCream ic = new ChocolateChips(
                new VanillaScoop(
                        new StrawberyScoop(
                                new ChocolateChips(
                                        new ChocolateCone(
                                                new ChocolateCone(
                                                        new OrangeCone()
                                                )
                                        )
                                )
                        )
                )
        );
        System.out.println(ic.getDescription());
        System.out.println(ic.getCost());
    }
}
