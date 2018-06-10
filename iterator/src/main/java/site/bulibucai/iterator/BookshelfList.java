package site.bulibucai.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HuanRong[https://github.com/Huan-Rong]
 */
public class BookshelfList implements Aggregate {

    private List<Book> books;

    public BookshelfList(int maxsize) {
        books = new ArrayList<Book>(maxsize);
    }

    public Book getBook(int index) {
        if (index < books.size()) {
            return books.get(index);
        }
        return null;
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookshelfListIterator(this);
    }
}
