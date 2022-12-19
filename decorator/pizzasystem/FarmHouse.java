package design_patterns.decorator.pizzasystem;

public class FarmHouse implements Pizza{

    Pizza p;

    public FarmHouse() {}

    public FarmHouse(Pizza p){
        this.p = p;
    }

    @Override
    public int getCost() {
        if (p != null){
            return p.getCost() + 150;
        }
        return 150;
    }

    @Override
    public String getDescription() {
        if (p != null){
            return p.getDescription() + " FarmHouse";
        }
        return "FarmHouse";
    }
}
