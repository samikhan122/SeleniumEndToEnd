package Encapusalation;

public class Employee {

    private String name;
    private int age;
    private double salary;


    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public String getName() {
        return this.name;
    }

  //  public void setName(String name) {
  //      this.name = name;

 //   }


}
