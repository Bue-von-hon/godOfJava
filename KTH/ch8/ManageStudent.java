public class ManageStudent {
    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "0100000000", "asd@gmail.com");
        return students;
    }
    public static void main(String[] args) {
        Student[] students = null;
        ManageStudent manageStudent = new ManageStudent();
        students = manageStudent.addStudent();
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }
}
