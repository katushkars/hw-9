import org.w3c.dom.ls.LSOutput;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Author author = new Author("Стивен", "Кинг");
        Book book=new Book("Мастер и Маргарита", author,2003 );
        System.out.println(book);
        Author author1= new Author("Михаил","Булгаков");
        Book book1=new Book("Морфий",author1,1099);
        book1.setYear(1999);
        System.out.println(book1);
        Author author2= new Author("Иван","Иванов" );
        Book book2 = new Book("Нулевая книга", author2, 1999);
        Book book3=new Book("Книга сравнения", author1,1999);
        System.out.println(book2.equals(book3));

    }
    }

