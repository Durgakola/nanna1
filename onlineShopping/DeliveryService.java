package onlineShopping;

public class DeliveryService {
    public String typeOfService;

    public String getTypeOfService() {

        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {

        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "DeliveryService{" +
                "typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
