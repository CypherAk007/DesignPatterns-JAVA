package O3_BuilderDP;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setId(1);
        builder.setName("Ak");
//        builder.setAge(20); //Exception in thread "main" java.lang.RuntimeException: Validation Failed!!

        builder.setAge(26);

        Student student = new Student(builder);
//        System.out.println("Student Details: Id: "+student.getId()+" Name: "+student.getName()+" Age: "+student.getAge());
        System.out.println(student);
//        Student{id=1, name='Ak', age=26, psp=0.0, universityName='null', email='null', phoneNumber='null'}
    }
}
