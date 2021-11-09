package Model.excercise;

public class Exercise {
    private int number ;
    private String  type ;

    public Exercise(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public Exercise() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "number=" + number +
                ", type='" + type + '\'' +
                '}';
    }
}
