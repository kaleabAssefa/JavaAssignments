public class Student {
    static String schoolName = "Takeo HighSchool";
    int studentId;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = 1;

        Student s2 = new Student();
        s2.studentId = 2;

        System.out.println("Student ID:" + s1.studentId);
        System.out.println("Student ID " + s2.studentId);
        System.out.println("School Namne: " + s1.schoolName);
        System.out.println("School Name: " + s2.schoolName);
    }
}
