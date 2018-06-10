package site.bulibucai.iterator;

/**
 * @author HuanRong[https://github.com/Huan-Rong]
 */
public class Bookshelf implements Aggregate {

    private Book[] books;
    private int next = 0;

    public Bookshelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBook(int index) {
        if (index < books.length) {
            return books[index];
        }
        return null;
    }

    public void appendBook(Book book) {
        if (next < books.length) {
            this.books[next] = book;
            next++;
        }
    }

    public int getLength() {
        return next;
    }

    public Iterator iterator() {
        return new BookshelfIterator(this);
    }
}
