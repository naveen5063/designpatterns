package design_patterns.decorator.pizzasystem;

public class BBQChicken implements Pizza{
    Pizza p;

    public BBQChicken() {}

    public BBQChicken(Pizza p){
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
            return p.getDescription() + " BBChicken";
        }
        return "BBChicken";
    }
}
