package practiceswiggy;
public class SwiggyApp {
    public static void main(String[] args) {
        String correctUsername = "durga";
        String correctPassword = "durga123";
        String enteredUsername = "durga";
        String enteredPassword = "durga123";

        SwiggyLogin swiggyLogin = new SwiggyLogin(correctUsername, correctPassword);

        if (swiggyLogin.login(enteredUsername, enteredPassword)) {
            System.out.println("Login successful!");
            String itemName = "Biryani";
            int quantity = 2;
            Order order = new FoodOrder(itemName, quantity);
            double totalAmount = order.calculateTotalAmount();
            Payment payment = new PhonePePayment();
            boolean paymentStatus = payment.makePayment(totalAmount);

            if (paymentStatus) {
                System.out.println("Payment successful!");
                checkout(order);
            } else {
                System.out.println("Payment failed. Please try again.");
            }
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }
    }
    private static void checkout(Order order) {
        System.out.println("Order placed successfully!");
        System.out.println("Item: " + order.itemName);
        System.out.println("Quantity: " + order.quantity);
    }
}

