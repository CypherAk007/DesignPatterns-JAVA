package O3_BuilderDPv4;

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

    private Student(Builder builder){
////        Validations
//        if(builder.getAge()<25){
//            throw new RuntimeException("Validation Failed!!");
//        }

//        Setting from Builder -> Student
        this.id = builder.getId();
        this.age = builder.getAge();
        this.email = builder.getEmail();
        this.name = builder.getName();
        this.psp = builder.getPsp();
        this.universityName = builder.getUniversityName();
        this.phoneNumber = builder.getPhoneNumber();
    }


    public static Builder getBuilder(){
        return new Builder();
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

//    MAKE BUILDER STATIC CLASS AS IT CAN BE ACCESSIBLE BY getBuilder() WHICH IS A STATIC FNC
    public static class Builder {
        private int id;
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String email;

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
//        return new Builder(); // we cant return this as new obj will be return instead of cur obj
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        public String getUniversityName() {
            return universityName;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        private String phoneNumber;

        public Student build(){
            //        Validations
            if(this.getAge()<25){
                throw new RuntimeException("Validation Failed!!");
            }
//        ONCE THE STUDENT IS PRIVATE THEN WE CANT ACCESS HERE SO
//                BRING THE BUILDER  CLASS INSIDE STUDENT SO THAT PRIVATE IS ACCESSABLE
            return new Student(this);
        }

    }
}
