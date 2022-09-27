import org.w3c.dom.ls.LSOutput;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Author author = new Author("Стивен", "Кинг");
        Book book=new Book("Мастер и Маргарита", author,2003 );
        System.out.println("book = " + book.getName()+" "+book.getAuthor().getName()+" "+book.getAuthor().getFirstName()+" "+book.getYear());
        Author author1= new Author("Михаил","Булгаков");
        Book book1=new Book("Морфий",author1,1099);
        book1.setYear(1999);
        System.out.println("book1 = " + book1.getName()+" "+book1.getAuthor().getName()+" "+book1.getAuthor().getFirstName()+" "+book1.getYear());

    }
    }
