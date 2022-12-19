package design_patterns.singleton;

public class DatabaseEagerLoading {

    // handles concurency
    // start time increases
    // info required to creating new instance should be available at class loading itself

    private static DatabaseEagerLoading instance = new DatabaseEagerLoading();

    private DatabaseEagerLoading()
    {

    }

    public static DatabaseEagerLoading getInstance(){
        return instance;
    }

}
