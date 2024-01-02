package teacher.lesson_15.lessoncode.sample_code;

public class PaymentService {
    public boolean processPayment(double amount, String userToken) {
        // Simulate payment processing
        // In a real scenario, this would interact with a payment gateway
        return Math.random() > 0.5; // Randomly simulate payment success or failure
    }
}
