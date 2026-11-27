abstract class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    abstract void calculateBonus();

    void display() {
        System.out.println("Name: " + name + " | Salary: " + (int) salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void calculateBonus() {
        System.out.println("Manager Bonus: " + (int) (getSalary() * 0.20));
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void calculateBonus() {
        System.out.println("Developer Bonus: " + (int) (getSalary() * 0.10));
    }
}

public class FinalPractice {
    public static void main(String[] args) {
        System.out.println("===== Employee Management System =====");

        Employee emp1 = new Manager("Salman", 80000);
        emp1.display();
        emp1.calculateBonus();

        System.out.println();

        Employee emp2 = new Developer("Rohit", 50000);
        emp2.display();
        emp2.calculateBonus();
    }
}
