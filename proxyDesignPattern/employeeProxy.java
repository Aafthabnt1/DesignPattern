package proxyDesignPattern;

public class employeeProxy implements Employee{

    private EmployeeTable employeeTable=new EmployeeTable();

    @Override
    public void create(String client) {
        if(client.equals("ADMIN")){
            employeeTable.create(client);
        }
        System.out.println("Access Denied");
    }

    @Override
    public void delete(String client) {
        if(client.equals("ADMIN")){
            employeeTable.delete(client);
        }
        System.out.println("Access Denied");
    }

    @Override
    public void modify(String client) {
        if(client.equals("ADMIN")){
            employeeTable.modify(client);
        }
        System.out.println("Access Denied");
    }
}
