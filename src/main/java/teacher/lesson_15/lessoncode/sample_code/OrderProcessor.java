package teacher.lesson_15.lessoncode.sample_code;

public class OrderProcessor {
    private OrderDatabase db;
    private PaymentService paymentService;
    private NotificationService notificationService;

    public OrderProcessor(OrderDatabase db, PaymentService paymentService, NotificationService notificationService) {
        this.db = db;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    public void processOrder(String orderId, String userToken) {
        Order order = db.getOrderById(orderId);
        if (order != null && order.getStatus() == OrderStatus.NEW) {
            boolean paymentConfirmed = paymentService.processPayment(order.getTotalAmount(), userToken);
            if (paymentConfirmed) {
                order.setStatus(OrderStatus.PROCESSING);
                db.updateOrder(order);
                notificationService.sendNotification(order.getUser(), "Your order is being processed.");
            } else {
                notificationService.sendNotification(order.getUser(), "Payment failed. Please retry.");
            }
        } else if (order != null && order.getStatus() != OrderStatus.NEW) {
            notificationService.sendNotification(order.getUser(), "Order cannot be processed.");
        } else {
            throw new IllegalArgumentException("Invalid order ID");
        }
    }

    // Other methods...
}