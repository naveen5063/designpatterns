package design_patterns.decorator.pizzasystem;

public class Tomato implements Pizza{
    Pizza p;

    public Tomato(Pizza p){
        this.p = p;
    }

    @Override
    public int getCost() {
        if (p != null){
            return p.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if (p != null){
            return p.getDescription() + " Tomato";
        }
        return " Tomato";
    }
}
