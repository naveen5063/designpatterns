package design_patterns.singleton;

public class DatabaseDoubleCheckLocking {
    private static DatabaseDoubleCheckLocking instance = null;

    private DatabaseDoubleCheckLocking(){

    }

    public static DatabaseDoubleCheckLocking getInstance(){
        if (instance == null){
            synchronized (DatabaseDoubleCheckLocking.class){
                if (instance == null){
                    instance = new DatabaseDoubleCheckLocking();
                }


        }
        }
        return instance;
    }
}
