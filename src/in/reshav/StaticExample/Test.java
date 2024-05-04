package in.reshav.StaticExample;

public class Test {

        String name;
        int age;
        int salary;
        static int population;

        Test(String name, int age, int salary, int population) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            Human.population += 1;
            System.out.println(Human.population);
        }

        // main method with varX variable
    
        public static void main(String ...args) {

            Human reshav = new Human("reshav", 22, 150000, 20000);
            Human eeshav = new Human("eeshav", 22, 100000, 20000);
            Human meshav = new Human("meshav", 32, 1000, 20000);
            Human neshav = new Human("neshav", 22, 180000, 20000);

            Sample();
        }

        static void Sample() {
            Main main = new Main();
            main.greetings();
        }
        // 20-04-2024 and now on 04-05-2024

        void greetings() {
            System.out.println("Namaste Bharat...!!!");
        }
}