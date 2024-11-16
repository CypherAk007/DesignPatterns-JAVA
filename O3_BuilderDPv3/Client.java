package O3_BuilderDPv3;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();

//        MAKE A FUNCTION IN STUDENT CLASS TO RETURN BUILDER
//        Builder builder = Student.getBuilder();
//        builder.setId(1);
//        builder.setName("Ak");
//        builder.setAge(26);

//        Student student = builder.build();
//        System.out.println(student);

        Student student = Student.getBuilder()
                .setId(1)
                .setName("AK")
                .setAge(26)
                .build();

        System.out.println(student);

    }
}
