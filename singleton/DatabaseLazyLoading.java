package design_patterns.singleton;

public class DatabaseLazyLoading {
    // lazy loading
    // concurreny problems
    private static DatabaseLazyLoading instance = null;

    private DatabaseLazyLoading() {

    }

    public static DatabaseLazyLoading getInstance() {
        if (instance == null) {
            instance = new DatabaseLazyLoading();
        }

        return instance;

    }
}