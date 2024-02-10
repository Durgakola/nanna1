package constructor;

public class FoodTest {

    public static void main(String[] args) {
        FoodItems food=new FoodItems();
        food.rice="plane rice";
        food.curry="potato";

        Family family=new Family("kanakadurga","dileep chakravarthi","malleswari","saraswathi",food);
        System.out.println("Home food : "+family);
        Family family1=new Family("kanakadurga","dileep chakravarthi","malleswari","saraswathi");
        System.out.println("Restarent food : "+family1);

    }
}
