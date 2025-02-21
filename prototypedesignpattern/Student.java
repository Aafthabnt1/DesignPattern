package prototypedesignpattern;
//when to use prototype pattern when we want to clone the same object  we can use prototype object
public class Student implements PrototypeInterface{
    private String name;
    private int rollNumber;
    private String address;

    public Student(String  name,int rollNumber,String address){
        this.address=address;
        this.rollNumber=rollNumber;
        this.name=name;
    }

    @Override
    public PrototypeInterface clone() {
        return new Student(name,rollNumber,address);
    }
}
