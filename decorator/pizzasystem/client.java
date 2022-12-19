package design_patterns.decorator.pizzasystem;

public class client {
    public static void main(String[] args) {
        Pizza p = new Panner(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(p.getCost());// should output 370
        System.out.println(p.getDescription()); // should output BBChicken + Tomato + Cheese + Paneer
    }
}
