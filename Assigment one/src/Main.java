public class Main {
    public static void main(String[] args) {
        studies courseA = new studies("Maths", 20, 30);
        studies courseB = new studies("Cyber", 40, 60);
        studies courseC = new studies("Database", 60, 90);
        int no_of_courses = 3;
        int totalstudents = courseA.RegisteredStudents + courseB.RegisteredStudents + courseC.RegisteredStudents;
    }
}
