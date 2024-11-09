public class Employee {
    String name;
    int emp_id;

    Employee(String name, int emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", emp_id=" + emp_id + "]";
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("iresh", 101);
        Employee e2 = new Employee("seema", 102);
        System.out.println(e1);
        System.out.println(e2);
    }
}