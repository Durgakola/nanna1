package forlloopdemo;

public class ForDemo {
    public static void main(String[] args) {
        //step:1 // for(int count=1;count<=100;count++){
//            System.out.println("count "+count);

        //infainet loop
//        for(int count=1;count<=100;){
//            System.out.println("count "+count);


//        int array[] = {3, 4, 1, 5};
//
//        for (int i = 0; i < array.length; i++) {
//
//            System.out.println(array[i]);
//        }
//    }
//}


        int array[] = {3, 4, 1, 5};
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }
    }
}
