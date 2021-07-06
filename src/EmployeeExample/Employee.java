package EmployeeExample;

public class Employee {
    int id;
    String name;
    String add;

    public Employee(int id, String name, String add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    public void emp(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee name: "+ name);
        System.out.println("Employee Address:" +add);
    }
}
