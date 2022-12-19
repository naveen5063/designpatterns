package design_patterns.builder;

public class student {
    private String name;
    private int age;
    private int year;
    private String batch;

    public student(builder b){
        if (b.getYear() > 2022){
            throw new IllegalArgumentException("grad year cannot be greater than 2022");
        }

        this.name = b.getName();
        this.age = b.getAge();
        this.year = b.getYear();
        this.batch = b.getBatch();

}
}
