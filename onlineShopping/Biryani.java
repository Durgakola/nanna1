package onlineShopping;

public class Biryani {
    public String type;

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    @Override
    public String toString() {
        return "BiryaniService{" +
                "type='" + type + '\'' +
                '}';
    }
}
