package design_patterns.builder;

public class client {
    public static void main(String[] args) {
//        builder b = new builder();
//        b.setAge(12);
//        b.setName("naman");
//        b.setBatch("mechanical");
//        b.setYear(2024);
//        student s = new student(b);

        StudentInnerBuilder.Builder getbuilder = StudentInnerBuilder.getbuilder();
                getbuilder.setName("naman");
                getbuilder.setAge(12);
                getbuilder.setBatch("civil");
                getbuilder.setYear(2023);
        StudentInnerBuilder s = getbuilder.build();

    }
}
