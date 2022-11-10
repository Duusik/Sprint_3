import java.time.LocalDateTime;
import java.util.List;

public class Order {
    public List<String> color;
    public String address;
    public String firstName;
    public String lastName;
    public String deliveryDate;
    public String metroStation;
    public String phone;
    public int rentTime;
    public String comment;

    public Order(List<String> color) {
        this.color = color;
        this.address = "ул. Ошанина, 10";
        this.firstName = "Андрей";
        this.lastName = "Сухов";
        this.deliveryDate = LocalDateTime.now().toString();
        this.metroStation = "3";
        this.phone = "+79201341452";
        this.rentTime = 3;
        this.comment = "Хочу кататься";
    }
}