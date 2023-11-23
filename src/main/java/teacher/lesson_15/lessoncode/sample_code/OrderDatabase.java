package teacher.lesson_15.lessoncode.sample_code;

import java.util.HashMap;
import java.util.Map;

public class OrderDatabase {
    private Map<String, Order> orders = new HashMap<>();

    public Order getOrderById(String orderId) {
        return orders.get(orderId);
    }

    public void updateOrder(Order order) {
        orders.put(order.getId(), order);
    }

    // Method to add orders for testing
    public void addOrder(Order order) {
        orders.put(order.getId(), order);
    }
}