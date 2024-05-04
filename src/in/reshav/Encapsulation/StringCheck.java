package in.reshav.Encapsulation;

public class StringCheck {

    public void atTheSetTheory() {
        System.out.println("Access");
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
//
////        String str3 = new String("abc");
////
////        boolean str4 = str1.equals(str2);
////        boolean str5 = str1.equals(str3);
////
////        System.out.println(str4);
////        System.out.println(str5);
////
////        StringCheck sc = new StringCheck();
////        sc.atTheSetTheory();
//
//        String str3 = str1 + "1";
////        System.out.println(str1 + " " + str2 + " " + str3);
//        String str4 = str1 + "1";
////        System.out.println(str1 + " " + str2 + " " + str3 + " " + str4);
//        System.out.println(str3);
//        System.out.println(str4);
//

        boolean str4 = str1.equals(str2);
        boolean str5 = str1.equals(str3);

        System.out.println(str4 + "\n" + str5);

        System.out.println(str1.length() + "\n" + str1.substring(0, 3) + "\n" + str1.compareTo(str2) + "\n" +
                str1.indexOf('b'));

    }
}
