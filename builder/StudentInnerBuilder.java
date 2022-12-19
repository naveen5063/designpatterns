package design_patterns.builder;

public class StudentInnerBuilder {
    private String name;
    private int age;
    private int year;
    private String batch;

    public StudentInnerBuilder(Builder builder) {
        if (builder.getYear() > 2022){
            throw new IllegalArgumentException("grad year cannot be greater than 2022");
        }

        this.name = builder.getName();
        this.age = builder.getAge();
        this.year = builder.getYear();
        this.batch = builder.getBatch();
    }

    public static Builder getbuilder(){
        return new Builder();
    }

    public static class Builder{

        private String name;
        private int age;
        private int year;
        private String batch;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public StudentInnerBuilder build(){
            return new StudentInnerBuilder(this);
        }


    }
}
