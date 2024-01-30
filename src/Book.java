public class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    public Book(){

        this("unknown title","unknown author",0,0.0);
    }
    public Book(String title,String author){

        this(title,author,0,0.0);
    }
    public Book(String title,String author,int year,double price){
        this.title=title;
        this.author=author;
        this.year=year;
        this.price=price;
    }
    //Getter methods
    public String getTitle(){

        return title;
    }
    public String getAuthor(){

        return author;
    }
    public int getYear(){

        return year;
    }
    public double getPrice(){

        return price;
    }
    //main method
    public static void main(String[] args){
        Book book1=new Book();
        Book book2=new Book("Mahabharata","Rishi Ved Vyasa");
        Book book3=new Book("Bhagavad Gita","Rishi Ved Vyasa",1950,800);

        System.out.println("Book 1:Title=" +book1.getTitle() +", Author=" + book1.getAuthor() +", Year=" + book1.getYear() + ",Price=" + book1.getPrice());
        System.out.println("Book 2:Title=" +book2.getTitle() +", Author=" + book2.getAuthor() +", Year=" + book2.getYear() + ",Price=" + book2.getPrice());
        System.out.println("Book 3:Title=" +book3.getTitle() +", Author=" + book3.getAuthor() +", Year=" + book3.getYear() + ",Price=" + book3.getPrice());

    }
}
