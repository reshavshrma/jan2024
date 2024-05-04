package in.reshav.same;

//method overloading

public class Same {

    int a, b, c, d, result;

    public int sum(int a, int b) {
        return a+b;
    }

    public int sum(int a, int b, int c) {
        return a+b+c;
    }

    public int sum(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    public Same() {
        System.out.println("Inside the default constructor");
    }

    public Same(int a, int b) {
        result = a+b;
        System.out.println("Inside the parameterised constructor, Result: " + result);
    }

    public static void main(String[] args) {
        System.out.println("Inside main method, doing method overloading");
        Same same =new Same();
        Same s = new Same(5,6);
        int first = same.sum(2,4);
        int second = same.sum(2,4, 6);
        int third = same.sum(2,4, 6, 8);
        System.out.println("Sum of (a and b): " + first + "\n" + "Sum of (a, b and c): " + second + "\n" +
                "Sum of (a, b, c and d): " + third);
    }
}
