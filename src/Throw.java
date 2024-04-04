class Example {
    public void throwKeyWord(String name) throws IllegalArgumentException {

        if(name.contains("-")) {
            throw new IllegalArgumentException("\nYour name contains '-'. Correct it and re-write without any extra character.");
        }
        System.out.println(name);
    }

    public void throwsKeyWord(String name) throws IllegalArgumentException {

        if(name.contains("-")) {
            throw new IllegalArgumentException("\nYour name contains '-'. Correct it and re-write without any extra character.");
        }
        System.out.println(name);
    }
    public static void main(String[] args) throws IllegalArgumentException {
        Example e = new Example();
        System.out.print("\nException 1: ");
        e.throwKeyWord("Reshav Sharma");
        System.out.print("\nException 2: ");
        e.throwsKeyWord("Akr-Sharma");
    }
}
