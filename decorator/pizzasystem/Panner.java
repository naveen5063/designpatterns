package design_patterns.decorator.pizzasystem;

public class Panner implements Pizza{
    Pizza p;

    public Panner(Pizza p){
        this.p = p;
    }

    @Override
    public int getCost() {
        if (p != null){
            return p.getCost() + 60;
        }
        return 60;
    }

    @Override
    public String getDescription() {
        if (p != null){
            return p.getDescription() + " Panner";
        }
        return " Panner";
    }
}
