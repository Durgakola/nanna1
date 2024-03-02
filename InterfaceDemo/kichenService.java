package InterfaceDemo;

public class kichenService {
   private String typeOfOil;
    private String typeofRice;

    public void setTypeOfOil(String typeOfOil) {
        this.typeOfOil = typeOfOil;
    }

    public void setTypeofRice(String typeofRice) {
        this.typeofRice = typeofRice;
    }

    public String getTypeOfOil() {
        return typeOfOil;
    }

    public String getTypeofRice() {
        return typeofRice;
    }

    @Override
    public String toString() {
        return "kichenService{" +
                "typeOfOil='" + typeOfOil + '\'' +
                ", typeofRice='" + typeofRice + '\'' +
                '}';
    }
}
