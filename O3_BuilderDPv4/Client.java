package O3_BuilderDPv4;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setId(1)
                .setName("AK")
                .setAge(26)
                .build();

//        HERE THE BUILDER AND STUDENT ARE PUBLIC AND CAN BE ACCESSED BY CLIENT
//        HOW TO MAKE IT PRIVATE
//        Student student1 = new Student(new Builder());
//
        System.out.println(student);

    }
}
