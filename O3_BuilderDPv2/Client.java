package O3_BuilderDPv2;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setId(1);
        builder.setName("Ak");
//        builder.setAge(20); //Exception in thread "main" java.lang.RuntimeException: Validation Failed!!

        builder.setAge(26);

//        Student student = new Student(builder);
//        WE CREATED A FUNCTION WHICH RETURNS STUDENT INSIDE THE BUILDER CLASS

//        MOVE THE VALIDATION LOGIC BEFORE THE STUDENT OBJECT IS CREATED
//            - MOVE IT TO THE build function of Builder
        Student student = builder.build();
        System.out.println(student);

    }
}
