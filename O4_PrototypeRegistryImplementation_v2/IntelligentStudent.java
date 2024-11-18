package O4_PrototypeRegistryImplementation_v2;

public class IntelligentStudent extends Student {
    private int iq;
    private double averageIqOfBatch;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent other){
//        NOTE: WE ARE COPYING THE PRIVATE ATTRIBUTES OF PARENT CLASS
        super(other);
        this.iq = other.iq;
        this.averageIqOfBatch = other.averageIqOfBatch;
    }

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
        return new IntelligentStudent(this);
    }
}
