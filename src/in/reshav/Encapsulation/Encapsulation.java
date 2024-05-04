package in.reshav.Encapsulation;

public class Encapsulation {

    /* Achievement of encapsulation
    -> declare the variables as private
    -> have setter and getter methods to modify and view the variables values */

    private String name;
    private int roll_no;

    public void setData(String newName, int newRoll_no) {
        name = newName;
        roll_no = newRoll_no;
    }

    public String getData() {
        return "Name is " + name + "\n" + "Age is " + roll_no;
    }
}