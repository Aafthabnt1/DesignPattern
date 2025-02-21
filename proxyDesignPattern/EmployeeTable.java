package proxyDesignPattern;

public class EmployeeTable implements Employee{


    @Override
    public void create(String client) {
        System.out.println("The object got created successfully");
    }

    @Override
    public void delete(String client) {
        System.out.println("The object got deleted successfully");
    }

    @Override
    public void modify(String client) {
        System.out.println("The object got modified successfully");
    }
}
