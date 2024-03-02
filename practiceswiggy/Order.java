package practiceswiggy;

public abstract class Order {
        protected  String itemName;
        protected int quantity;
        public Order(String itemName, int quantity) {
            this.itemName = itemName;
            this.quantity = quantity;
        }
        public abstract double calculateTotalAmount();
    }
