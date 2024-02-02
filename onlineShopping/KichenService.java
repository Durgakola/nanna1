package onlineShopping;

public class KichenService {
    public String typeOfOil;
    public String typeOfRice;

    public String getTypeOfOil() {
        return typeOfOil;
    }

    public String getTypeOfRice() {
        return typeOfRice;
    }

    public void setTypeOfRice(String typeOfRice) {
        this.typeOfRice = typeOfRice;
    }

    public void setTypeOfOil(String typeOfOil) {
        this.typeOfOil = typeOfOil;
    }

    @Override
    public String toString() {
        return "KichenService{" +
                "typeOfRice='" + typeOfRice + '\'' +
                ", typeOfOil='" + typeOfOil + '\'' +
                '}';
    }

}
