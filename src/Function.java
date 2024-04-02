public class Function {

    public void goodMorningWishes() {
        System.out.println("Good Morning");
    }

    public void addition(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        System.out.println("Sum of " + firstNum + " and " + secondNum + " is " + sum);
    }
    public static void main(String[] args) {
        Function f = new Function();
        f.goodMorningWishes();
        f.addition(5,6);
        f.addition(15,6);
        f.addition(2500,658);
        f.addition(98,256);
        f.goodMorningWishes();
    }
}
