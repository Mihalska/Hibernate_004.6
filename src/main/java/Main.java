import org.example.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookHelper bk = new BookHelper();

//       String[] names = {"Black", "White", "Grey"};
//       for (String name : names) {
//            Book book = new Book();
//            book.setName(name);
//            bk.addBook(book);
//        }
// --------------отримати колекцію об'єктів.
//        List<Book> bookList = bk.getBookList();
//        for (Book a : bookList) {
//            System.out.println(a.getId() + " " + a.getName());
//        }
/// --------------добавити Новий(і) Book.
//       Book book = new Book();
//       book.setName("Green");
//       bk.addBook(book);
// -----------------отримати конкретний Book по id.
         Book b = bk.getBookById(3);
         System.out.println(b.getName());
    }

}

