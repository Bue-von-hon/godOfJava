package test.ttestt.JTW.ch8;

public class J_ManageStudent {
    public static void main(String[] args) {
        J_Student[] student = null;
        J_ManageStudent main = new J_ManageStudent();
        student = main.J_addStudent();
        main.J_printStudents(student);
    }

    public J_Student[] J_addStudent() {
        J_Student[] student = new J_Student[3];
        student[0] = new J_Student("Lim");
        student[1] = new J_Student("Min");
        student[2] = new J_Student("Seok", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        return student;
    }

    public void J_printStudents(J_Student[] student) {
        for (J_Student a : student) {
            System.out.println(a);
        }
    }
}
