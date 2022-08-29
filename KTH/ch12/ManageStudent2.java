public class ManageStudent2 {
    public Student2[] addStudent() {
        Student2[] students = new Student2[3];
        students[0] = new Student2("Lim");
        students[1] = new Student2("Min");
        students[2] = new Student2("Sook", "Seoul", "0100000000", "asd@gmail.com");
        return students;
    }
    public static void main(String[] args) {
//        Student2[] students = null;
//        ManageStudent2 manageStudent = new ManageStudent2();
//        students = manageStudent.addStudent();
//        printStudents(students);
        checkEquals();
    }

    private static void printStudents(Student2[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }

    static void checkEquals() {
        Student2 st1 = new Student2("Min", "abc@naver.com", "Seoul", "01012345678");
        Student2 st2 = new Student2("Min", "abc@naver.com", "Seoul", "01012345678");
        if (st1.equals(st2)) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
