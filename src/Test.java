public class Test {

    public static void main(String[] args) {
//        String str1 = "abc";
//        String str2 = "abc";
//        System.out.println("String 1 = " +  str1 + " and " + "String 2 = " + str2);
//        String str3 = str2 + " 1";
//
//        System.out.println("String 3 = " + str3);
//

        StringBuilder sentence = new StringBuilder("This is a sentence.");
        sentence.append(" Added word."); // concatenate using StringBuilder
        System.out.println(sentence);
    }
}

