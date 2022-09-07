import java.util.Objects;

public class Student1 {
    private final String name;
    private final String address;
    private final String phone;
    private final String email;

    public Student1(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return Objects.equals(name, student1.name) && Objects.equals(address, student1.address) && Objects.equals(phone, student1.phone) && Objects.equals(email, student1.email);
    }
}
