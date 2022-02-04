/**
 * Created by TGC on 18/01/2022.
 */
public class Student extends person {
    private String level;
    private double marks ;

    public Student(){}

    public Student( String name ,int id,String address,String level, double marks) {
        super(name,id,address);
        this.level = level;
        this.marks = marks;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }



}
