public class Course {
    String courseName, enrolledStudents;
    static int maxCapacity; // the maximum no of students for any course
    boolean isEnrolled;

    // to set maximum capacity for courses.
    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
        System.out.println(capacity);
    }

    // enroll the student
    public void enrollStudent(String studentName) { // parameters passed
        if(!isEnrolled) {
            System.out.println(studentName + " is enrolled. Kindly pay the fee at admission section.");
        } else {
            System.out.println(studentName + " is not enrolled.");
        }
    }

    // unenroll the enrolled student
    public void unenrollStudent(String studentName) {
        if(!isEnrolled) {
            System.out.println(studentName + " is unenrolled on his own request. Thanks for your patience.");
        } else {
            System.out.println(studentName + " is not enrolled.");
        }
    }

    // main method
    public static void main(String[] args) {
        Course course = new Course();
        //System.out.println(course.isEnrolled);
        course.enrollStudent("Reshav Sharma"); // arguments passed
        course.unenrollStudent("Reshav Sharma");
        setMaxCapacity(60);
    }
}
