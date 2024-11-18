package O4_PrototypeRegistryImplementation_v1;

public class IntelligentStudent extends Student{
    private int iq;
    private double averageIqOfBatch;
    public double getAverageIqOfBatch() {
        return averageIqOfBatch;
    }

    public void setAverageIqOfBatch(double averageIqOfBatch) {
        this.averageIqOfBatch = averageIqOfBatch;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                ", averageIqOfBatch=" + averageIqOfBatch +
                '}';
    }

    @Override
    public IntelligentStudent copy(){
        IntelligentStudent student = new IntelligentStudent();
//        student.setName(this.name);
//        student.setAge(this.age);

//        We cant access the private variables directly - we need getters
        student.setGender(this.getGender());
//        student.setGender(this.gender);
//        student.setStudentPsp(this.studentPsp);
//        student.setAveragePspOfBatch(this.averagePspOfBatch);
//        student.setBatch(this.batch);

        return student;
    }
}
