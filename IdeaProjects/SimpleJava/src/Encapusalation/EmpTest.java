package Encapusalation;

public class EmpTest {


    public static void main(String[] args) {
        Employee employee = new Employee("Loru", 20, 10000);
        System.out.println(employee.getName() +" " + employee.getAge() + " " + employee.getSalary());
    }
}
