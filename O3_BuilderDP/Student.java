package O3_BuilderDP;

public class Student {
//    WE ONLY HAVE GETTERS IN STUDENT CLASS
//    AS WE ARE SETTING VALUES FROM THE BUILDER CLASS


    private int id;
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String email;
    private String phoneNumber;

    public Student(Builder builder){
//        Validations
        if(builder.getAge()<25){
            throw new RuntimeException("Validation Failed!!");
        }

//        Setting from Builder -> Student
        this.id = builder.getId();
        this.age = builder.getAge();
        this.email = builder.getEmail();
        this.name = builder.getName();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
        this.phoneNumber = builder.getPhoneNumber();
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", universityName='" + universityName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
