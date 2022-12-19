package design_patterns.decorator.pizzasystem;

public class Pepperoni implements Pizza{
    Pizza p;

    public Pepperoni() {}

    public Pepperoni(Pizza p){
        this.p = p;
    }

    @Override
    public int getCost() {
        if (p != null){
            return p.getCost() + 180;
        }
        return 180;
    }

    @Override
    public String getDescription() {
        if (p != null){
            return p.getDescription() + " Pepperoni";
        }
        return "Pepperoni";
    }
}
