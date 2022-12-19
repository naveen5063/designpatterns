package design_patterns.decorator.pizzasystem;

public class Margherita implements Pizza{
    Pizza p;

    public Margherita() {}

    public Margherita(Pizza p){
        this.p = p;
    }

    @Override
    public int getCost() {
        if (p != null){
            return p.getCost() + 200;
        }
        return 200;
    }

    @Override
    public String getDescription() {
        if (p != null){
            return p.getDescription() + " Margherita";
        }
        return "Margherita";
    }
}
