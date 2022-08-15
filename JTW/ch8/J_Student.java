package test.ttestt.JTW.ch8;

public class J_Student {
    String name;
    String address;
    String phone;
    String email;

    public J_Student(String name) {
        this.name = name;
    }

    public J_Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " " + address + " " + phone + " " + email;
    }
}
