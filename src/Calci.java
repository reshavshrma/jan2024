// engineering calci in java

class Calci {

    static double firstNo = 15;
    static double secondNo = 2;
    static double thirdNo = 4;

    // main method

    public static void main(String ...args) {

        // created object to access all functions (non-static)
        Calci obj = new Calci();
        double result_1 = obj.mixedFracToNum(firstNo, secondNo, thirdNo);
        double result_2 = obj.division((int)firstNo, (int)secondNo);
        String result_3 = obj.divToMixedFrac(firstNo, secondNo);
        String result_4 = obj.squareOfNumber(firstNo);
        String result_5 = obj.cubeOfNumber(firstNo);
        String result_6 = obj.logBase10(firstNo);
        String result_7 = obj.expFunction(firstNo);
        String result_8 = obj.squareRoot(firstNo);
        String result_9 = obj.cubeRoot(firstNo);
        double result_10 = obj.factorialOfNum(firstNo);
        double result_11 = obj.add(firstNo, secondNo);
        double result_12 = obj.sub(firstNo, secondNo);
        double result_13 = obj.mul(firstNo, secondNo);
        long result_14 = obj.permutation((long)firstNo, (long)secondNo);
        long result_15 = obj.combination((long)firstNo, (long)secondNo);

        // printing functions
        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);
        System.out.println(result_4);
        System.out.println(result_5);
        System.out.println(result_6);
        System.out.println(result_7);
        System.out.println(result_8);
        System.out.println(result_9);
        System.out.println(result_10);
        System.out.println(result_11);
        System.out.println(result_12);
        System.out.println(result_13);
        System.out.println(result_14);
        System.out.println(result_15);
    }

    public String toString() {
        return "MATHS ERROR";
    }

    // function 1 - mixed fraction to number

    public double mixedFracToNum(double a, double b, double c) {

        // check whether a or b = 0, if so, return b
        if(a==0 || c==0) {
            return b;
        }

        // check whether b = 0, if so, return c*a
        else if(b==0) {
            return c*a;
        }

        // check if a,b and c != 0, then return c*a+b, which is our desied output too
        else {
            return c*a+b;
        }
    }

    // function 2 - division

    public int division(int a, int b) {

        try {
            int result = a/b;
            System.out.println(result);
            return result;
        }

        catch(Throwable throwable) {
            System.out.println("Divide by zero is not possible.");
            return 0;
        }
    }

    // function 3 - like division(a/b) to mixed fraction

    public String divToMixedFrac(double a, double b) {
        int gcd = 1;
        int i = 2;
        int least = (int)(Math.min(a, b));
        while (i <= least) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }

        // calculate the simplified numerator and denominator
        double simpNumerator = (a/gcd);
        double simpDenominator = (b/gcd);

        // do div to mixed fraction
        double quotient = (int)(simpNumerator/simpDenominator);
        double numerator = simpNumerator % simpDenominator;
        double denominator = simpDenominator;

        // check if b = 0
        if (b == 0) {
            return "0";
        }

        // check if a >= b
        else if (a >= b) {
            return quotient + " ¬ " + numerator + " ¬ " + denominator;
        }

        // check if a < b
        else {
            return numerator + " ¬ " + denominator;
        }
    }


    // function 4 - cube of a number

    public String cubeOfNumber(double a) {

        // check if a = 0, return error
        if(a==0) {
            return toString();
        }

        // otherwise return cubeRoot
        else {
            double result = (a*a*a);
            return Double.toString(result);
        }
    }

    // function 5 - square of a number

    public String squareOfNumber(double a) {

        // check if a = 0, return error
        if(a==0) {
            return toString();
        }

        // otherwise return squareRoot
        else {
            double result = a*a;
            return Double.toString(result);
        }
    }

    // function 6 - logarithm of base 10

    public String logBase10(double a) {

        // check if a = 0, return error
        if (a == 0) {
            return "Maths ERROR";
        }

        // otherwise return log base 10
        else {
            double result = Math.log10(a);
            return Double.toString(result);
        }
    }

    // function 7 - exponential function e^x

    public String expFunction(double a) {
        double result = Math.exp(a);
        return Double.toString(result);
    }

    // function 8 - squareRoot

    public String squareRoot(double a) {
        double result = Math.sqrt(a);
        return Double.toString(result);
    }

    // function 9 - cubeRoot

    public String cubeRoot(double a) {
        double result = Math.cbrt(a);
        return Double.toString(result);
    }

    // function 10 - factorial of a number

    public double factorialOfNum(double a) {

        int fact = 1;
        for(int num = 1; num <= a; num++) {
            fact = fact * num;
        }
        System.out.println(fact);
        return fact;
    }

    // function 11 - addition of two numbers

    public double add(double a, double b) {
        return a+b;
    }

    // function 12 - subtraction of two numbers

    public double sub(double a, double b) {
        return a-b;
    }

    // function 13 - multiplication of two numbers

    public double mul(double a, double b) {
        return a*b;
    }

    // function 14 - permutation

    public long permutation(long a, long b) {
        return (long)(factorialOfNum(a)/factorialOfNum(a-b));
    }

    // function 15 - combination

    public long combination(long a, long b) {
        return (long)(factorialOfNum(a) / (long)(factorialOfNum(b) * (long)factorialOfNum(a-b)));
    }
}