package in.reshav.StaticExample;

public class Human {
    String name;
    int age;
    int salary;
    static int population;

    Human(String name, int age, int salary, int population) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population += 1;
        System.out.println(Human.population);
    }
}
