package marks;

public class Subject {
    public String name;
    public int marks;
    public String result;

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", result='" + result + '\'' +
                '}';
    }
}
