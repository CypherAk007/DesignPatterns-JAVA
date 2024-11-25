package O4_PrototypeRegistryImplementation_v2;

public class Client {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

//        Student student = registry.get("Nov24");// This will modify the registry itself
        Student student = registry.get("Nov24").copy();
        student.setName("AK");
        student.setAge(23);
        student.setGender("Male");
        System.out.println(student);

        Student copyStudent = student.copy();
        copyStudent.setName("CK");
        copyStudent.setAge(26);
        copyStudent.setGender("Female");

        System.out.println(copyStudent);

        Student nov24batchIntelligentStudent = registry.get("nov24batchIntelligentStudent").copy();
        nov24batchIntelligentStudent.setName("BK");
        nov24batchIntelligentStudent.setAge(33);

        System.out.println(nov24batchIntelligentStudent);

        IntelligentStudent nov24batchIntelligentStudent1 = (IntelligentStudent) registry.get("nov24batchIntelligentStudent").copy();
        nov24batchIntelligentStudent1.setName("BK");
        nov24batchIntelligentStudent1.setAge(33);

        System.out.println(nov24batchIntelligentStudent1);

        Student othercopy = nov24batchIntelligentStudent1.copy();
        System.out.println(othercopy);
    }

    private static void fillRegistry(StudentRegistry registry){
        Student nov24batch = new Student();

        nov24batch.setStudentPsp(90);
        nov24batch.setAveragePspOfBatch(95);
        nov24batch.setBatch("Nov24");

        registry.register("Nov24",nov24batch);
        System.out.println(nov24batch);

        IntelligentStudent nov24batchIntelligentStudent = new IntelligentStudent();
        nov24batchIntelligentStudent.setAveragePspOfBatch(90);
        nov24batchIntelligentStudent.setBatch("Nov24");
        nov24batchIntelligentStudent.setAverageIqOfBatch(100);

        registry.register("nov24batchIntelligentStudent",nov24batchIntelligentStudent);
        System.out.println(nov24batchIntelligentStudent);
    }
}
