package design_patterns.decorator.pizzasystem;

public class Olive implements Pizza{
    Pizza p;

    public Olive(Pizza p){
        this.p = p;
    }

    @Override
    public int getCost() {
        if (p != null){
            return p.getCost() + 20;
        }
        return 20;
    }

    @Override
    public String getDescription() {
        if (p != null){
            return p.getDescription() + " Olive";
        }
        return " Olive";
    }
}
