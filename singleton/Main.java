package design_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseLazyLoading d1 = DatabaseLazyLoading.getInstance();
        System.out.println(d1);
        DatabaseEagerLoading d2 = DatabaseEagerLoading.getInstance();
        System.out.println(d2);
        DatabaseDoubleCheckLocking d3 = DatabaseDoubleCheckLocking.getInstance();
        System.out.println(d3);
    }
}