package org.example.bydirection;


public class Test {
    public static void main(String[] args) {
        Cuntry cunt=new Cuntry();
        cunt.name="INDIA";
        cunt.phonenumCode=91;
        cunt.language="HINDI";

        State ste=new State();
        ste.name="Andhra pradesh";
        ste.language="TELUGU";
        ste.cuntry.state= cunt.state;

        System.out.println();
    }

}
