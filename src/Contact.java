import java.util.ArrayList;
public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String info() {
        return "Имя: " + name + ", Телефон: " + phone;
    }
}


