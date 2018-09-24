package Person;

public class Student extends Person {
    private int year ;
    private double fee;
    private String program;
    public Student (String name, String address, String program,int year, double fee){
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString (){
        return "Name:" + getName() + " Address: " + getAddress() + " Program: " + program + " year: " + year + " fee: " +fee;
    }
}
