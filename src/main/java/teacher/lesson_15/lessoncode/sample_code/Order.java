package teacher.lesson_15.lessoncode.sample_code;

public class Order {
    private String id;
    private double totalAmount;
    private String user;
    private OrderStatus status;

    public Order(String id, double totalAmount, String user, OrderStatus status) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.user = user;
        this.status = status;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getUser() {
        return user;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}