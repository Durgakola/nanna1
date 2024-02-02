package Amazon;

public class Test {
    public static void main(String[] args) {
        AmzonLoginService amzonLoginService=new AmzonLoginService();

        UserLoginDetails userLoginDetails=new UserLoginDetails();
        userLoginDetails.userId="durga123";
        userLoginDetails.password="123456";

        String loginStatus=amzonLoginService.loginService(userLoginDetails);
        System.out.println(loginStatus);

        ProductsProcessService productsProcessService=new ProductsProcessService();
        Products products=new Products();
        products.kurthis=10;
       int itemsAdded= productsProcessService.getItems(products);
        System.out.println("Total items:"+" "+itemsAdded);

    }
}
