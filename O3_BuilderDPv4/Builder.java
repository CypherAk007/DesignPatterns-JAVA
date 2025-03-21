//package O3_BuilderDPv4;
//
//public class Builder {
//    private int id;
//    private String name;
//    private int age;
//    private double psp;
//    private String universityName;
//    private String email;
//
//    public int getId() {
//        return id;
//    }
//
//    public Builder setId(int id) {
//        this.id = id;
////        return new Builder(); // we cant return this as new obj will be return instead of cur obj
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Builder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public Builder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public double getPsp() {
//        return psp;
//    }
//
//    public void setPsp(double psp) {
//        this.psp = psp;
//    }
//
//    public String getUniversityName() {
//        return universityName;
//    }
//
//    public void setUniversityName(String universityName) {
//        this.universityName = universityName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    private String phoneNumber;
//
//    public Student build(){
//        //        Validations
//        if(this.getAge()<25){
//            throw new RuntimeException("Validation Failed!!");
//        }
////        ONCE THE STUDENT IS PRIVATE THEN WE CANT ACCESS HERE SO
////                BRING THE BUILDER  CLASS INSIDE STUDENT SO THAT PRIVATE IS ACCESSABLE
//        return new Student(this);
//    }
//
//}
