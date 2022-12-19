package design_patterns.decorator.pizzasystem;

public class Cheese implements Pizza{
    Pizza p;

    public Cheese(Pizza p){
        this.p = p;
    }

    @Override
    public int getCost() {
        if (p != null){
            return p.getCost() + 80;
        }
        return 80;
    }

    @Override
    public String getDescription() {
        if (p != null){
            return p.getDescription() + " Cheese";
        }
        return " Cheese";
    }
}
