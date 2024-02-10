package constructor;

public class Student1 {

    public String name;
    public String fatherName;
    public String mobileNo;
    public String dateOfBirth;
    public Address address;

    public Student1(String name, String fatherName, String mobileNo, String dateOfBirth, Address address) {
        this.name = name;
        this.fatherName = fatherName;
        this.mobileNo = mobileNo;
        this.dateOfBirth = dateOfBirth;
        this.address = address;

//        Helloworld helloworld = new Helloworld();
//       String result= helloworld.display();
//        System.out.println(result);
    }
    public Student1(String name, String fatherName, String mobileNo, String dateOfBirth){
    this(name,fatherName,mobileNo,dateOfBirth,new Address());
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address=" + address +
                '}';
    }
}

