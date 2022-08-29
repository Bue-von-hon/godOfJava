import java.util.Objects;

public class Student2 {
    String name;
    String email;
    String address;
    String phone;

    public Student2(String name) {
        this.name = name;
    }

    public Student2(String name, String email, String address, String phone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Student2) ) return false;
        Student2 std = (Student2) obj;
        if (name != null && !name.equals(std.name)) return false;
        if (email != null && !email.equals(std.email)) return false;
        if (address != null && !address.equals(std.address)) return false;
        if (phone != null && !phone.equals(std.phone)) return false;
        return true;
    }
}
