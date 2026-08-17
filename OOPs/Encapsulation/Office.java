package Encapsulation;


class Employee {

    private int id;
    private String name;
    private double salary;
    
    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public double getSalary() {

        return salary;
    }


    public void setId(int id) {

        if (id >= 1) {
            this.id = id;
        } else {
            System.out.println("Invalid ID Please Check ");
        }

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }
}
public class Office {
    public static void main(String args[]) {

        Employee e = new Employee();
        e.setId(1);
        e.setName("Durgesh");
        e.setSalary(45550.50);

        System.out.println("Employee Id     : " + e.getId());
        System.out.println("Employee Name   : " + e.getName());
        System.out.println("Employee Salary : " + e.getSalary());


    }

}
