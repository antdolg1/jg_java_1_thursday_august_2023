package teacher.lesson_15.lessoncode.sample_code;

/**
 * This class contain method processOrder() and helper methods which contains business logic for order processing.
 *
 */

public class OrderProcessor {
    public static final String CANNOT_PROCESS_MESSAGE = "Order cannot be processed.";
    public static final String SUCCESS_ORDER_MESSAGE = "Your order is being processed.";
    public static final String FAILED_PAYMENT_MESSAGE = "Payment failed. Please retry.";

    private OrderDatabase db;
    private PaymentService paymentService;
    private NotificationService notificationService;

    public OrderProcessor(OrderDatabase db, PaymentService paymentService, NotificationService notificationService) {
        this.db = db;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    /**
     * Processes order according to business requirements mention in document ABD1233.
     * @param orderId Id of order.
     * @param userToken Unique UserToken which identifies user in the system.
     */

    public void processOrder(String orderId, String userToken) {
        Order order = getOrder(orderId);
        if (order.getStatus() == OrderStatus.NEW) {
            processNewOrder(order, userToken);
        } else {
            notifyUser(order, CANNOT_PROCESS_MESSAGE);
        }
    }

    private void notifyUser(Order order, String message) {
        notificationService.sendNotification(order.getUser(), message);
    }

    private Order getOrder(String orderId) {
        Order order = db.getOrderById(orderId);
        if (order == null) {
            throw new OrderNotFoundException(orderId);
        }
        return order;
    }

    private void processNewOrder(Order order, String userToken) {
        if (paymentService.processPayment(order.getTotalAmount(), userToken)) {
            updateOrderStatus(order);
            notifyUser(order, SUCCESS_ORDER_MESSAGE);
        } else {
            notifyUser(order, FAILED_PAYMENT_MESSAGE);
        }
    }

    private void updateOrderStatus(Order order) {
        order.setStatus(OrderStatus.PROCESSING);
        db.updateOrder(order);
    }

    // Other methods...
}

//    processOrder() before refactoring
//
//    public void processOrder(String orderId, String userToken) {
//        Order order = db.getOrderById(orderId);
//        if (order != null && order.getStatus() == OrderStatus.NEW) {
//            boolean paymentConfirmed = paymentService.processPayment(order.getTotalAmount(), userToken);
//            if (paymentConfirmed) {
//                order.setStatus(OrderStatus.PROCESSING);
//                db.updateOrder(order);
//                notificationService.sendNotification(order.getUser(), "Your order is being processed.");
//            } else {
//                notificationService.sendNotification(order.getUser(), "Payment failed. Please retry.");
//            }
//        } else if (order != null && order.getStatus() != OrderStatus.NEW) {
//            notificationService.sendNotification(order.getUser(), "Order cannot be processed.");
//        } else {
//            throw new IllegalArgumentException("Invalid order ID");
//        }
//    }
//}