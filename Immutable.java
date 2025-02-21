import java.util.ArrayList;
import java.util.List;

public final class Immutable {
    private int salary;
    private String name;
    private List<Integer> s;


    public int getSalary() {
        return salary;
    }

    public Immutable(int salary, String name,List<Integer> s) {
        this.salary = salary;
        this.name = name;
        this.s=s;
    }

    public List<Integer> getS() {
        return new ArrayList<>(s);
    }

    public String getName() {
        return name;
    }


}
