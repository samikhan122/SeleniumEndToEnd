package Array1;

public class ConstructorBasics {
    String name;
    int age;
    int salary;
    char gender;

    public ConstructorBasics(String name, int age) {
        this("ali", 20, 2000, 's');
        this.name = name;
        this.age = age;


    }

    public ConstructorBasics(String name, int age, int salary, char gender) {
        System.out.println("This method in being invoked");
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public static void main(String[] args) {
        ConstructorBasics cs = new ConstructorBasics("Tom",30);

    }
}
