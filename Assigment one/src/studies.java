public class studies {
    String courseName;
    int RegisteredStudents;
    static int totalstudents;
    public studies(String c, int r, int t) {
        courseName = c;
        RegisteredStudents = r;
        totalstudents= t;
    }
    public void result(){
        System.out.println("course Name" +courseName);
        System.out.println("Students registered "+RegisteredStudents);
        System.out.println("Total students "+totalstudents);
    }
}
