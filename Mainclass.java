package training;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class Mainclass {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Employees :");
        employee.name = "Abhi";
        System.out.println("Name: " + employee.name);
        employee.age = 30;
        System.out.println("Age: " + employee.age);
        

        Manager manager = new Manager();
        System.out.println("Manager :");
        manager.name = "Suthar";
        System.out.println("Name: " + manager.name);
        manager.age = 40;
        System.out.println("Age: " + manager.age);
    }
}
