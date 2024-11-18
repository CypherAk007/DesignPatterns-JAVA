package O4_PrototypeRegistryImplementation_v1;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("AK");
        student.setAge(23);
        student.setGender("Male");
        student.setStudentPsp(90);
        student.setAveragePspOfBatch(95);
        student.setBatch("Nov24");

        System.out.println(student);

        Student copyStudent = student.copy();
        copyStudent.setName("CK");
        copyStudent.setAge(26);
        copyStudent.setGender("Female");

        System.out.println(copyStudent);

    }
}
