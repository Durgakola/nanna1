package practiceswiggy;

public class FoodOrder extends Order{
        public FoodOrder(String itemName, int quantity) {
            super(itemName, quantity);
        }
        public double calculateTotalAmount() {
            double itemPrice = 10.0;
            return itemPrice * quantity;
        }
    }
