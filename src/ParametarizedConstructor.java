public class ParametarizedConstructor {
    public ParametarizedConstructor(Address aa,Country cc){
        System.out.println("from ParametarizedConstructor ");
    }
    public static void main(String[]args){
        Address a3=new Address();
        Country c3=new Country();
        ParametarizedConstructor p1=new ParametarizedConstructor(a3,c3);

    }

}
