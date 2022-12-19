package design_patterns.prototype;

public class client {
    public static void fillregistry(StudentRegistry studentRegistry){

        Student aprilbatchstudent = new Student();
        aprilbatchstudent.setBatch("april21");
        aprilbatchstudent.setAverageBatchPsp(89);

        studentRegistry.register("april21batch", aprilbatchstudent);

        IntelligentStudent aprilbatchintelligentstudent = new IntelligentStudent();
        aprilbatchintelligentstudent.setIq(180);
        aprilbatchintelligentstudent.setBatch("april21");
        aprilbatchintelligentstudent.setAverageBatchPsp(89);

        studentRegistry.register("april21batchintelligent", aprilbatchintelligentstudent);
    }

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillregistry(studentRegistry);

        Student siddharth = studentRegistry.get("april21batch").clone();
        siddharth.setName("Siddharth");
        siddharth.setAge(24);
        siddharth.setStudentPsp(91.0);

        Student intelligentSiddharth = studentRegistry.get("april21batchintelligent").clone();
//        if (intelligentSiddharth instanceof IntelligentStudent) {
//            (IntelligentStudent) ((IntelligentStudent) intelligentSiddharth).iq
//        }
        intelligentSiddharth.setName("Siddharth");
        intelligentSiddharth.setAge(24);
        intelligentSiddharth.setStudentPsp(91.0);

    }
}
