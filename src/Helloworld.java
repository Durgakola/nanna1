public class Helloworld {
    int age = 22;
    int add() {
        int a = 10;
        int b = 20;
        int c = a - b;
        System.out.println(c);
        return c;
    }
    public void Train() {

        System.out.println("Start the train");
    }

    public static void main(String[] args){

            Helloworld helloworld = new Helloworld();
            System.out.println(helloworld.age);
            helloworld.Train();
            helloworld.add();
    }
}




